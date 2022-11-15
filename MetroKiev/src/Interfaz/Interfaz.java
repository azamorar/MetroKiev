package Interfaz;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import aEstrella.Busqueda;
import grafoPonderado.Estacion;
import kiev.Geografia;
import kiev.Inicializar;

import javax.swing.JButton;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Map;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

@SuppressWarnings("serial")
public class Interfaz extends JFrame {

	public static Estacion origen;
	public static Estacion destino;
	private Font common = new Font("Monospaced", Font.BOLD, 15);

	public Interfaz() {
		int x = 150;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setTitle("Algoritmo A*");
		setBounds(100, 100, 1080, 720);

		// contentPane principal
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(30, 31, 34));

		// Mapa metro
		JLabel lblMapa = new JLabel("");
		lblMapa.setBackground(java.awt.Color.BLACK);
		lblMapa.setIcon(new ImageIcon(Interfaz.class.getResource("mapa_metro.png")));
		lblMapa.setBounds(540, 0, 540, 690);
		contentPane.add(lblMapa);

		// Texto origen
		JLabel lblOrigen = new JLabel("ORIGEN");
		lblOrigen.setBounds(230, 30+x, 80, 14);
		lblOrigen.setFont(common);
		lblOrigen.setForeground(Color.white);
		contentPane.add(lblOrigen);

		// Texto destino
		JLabel lblDestino = new JLabel("DESTINO");
		lblDestino.setBounds(230, 100+x, 80, 14);
		lblDestino.setForeground(Color.white);
		lblDestino.setFont(common);
		contentPane.add(lblDestino);

		Inicializar in = new Inicializar();
		// ComboBox origen
		JComboBox<String> cbLista1 = new JComboBox<String>();
		cbLista1.setBackground(Color.gray);
		cbLista1.setForeground(Color.white);
		cbLista1.setBounds(195, 50+x, 150, 20);
		cbLista1.setFont(common);
		contentPane.add(cbLista1);
		cbLista1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				origen = in.getEstacionByID(Integer.parseInt(cbLista1.getSelectedItem().toString()));
			}
		});

		// ComboBox destino
		JComboBox<String> cbLista2 = new JComboBox<String>();
		cbLista2.setBackground(Color.gray);
		cbLista2.setForeground(Color.white);
		cbLista2.setBounds(195, 120+x, 150, 20);
		cbLista2.setFont(common);
		contentPane.add(cbLista2);
		cbLista2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				destino = in.getEstacionByID(Integer.parseInt(cbLista2.getSelectedItem().toString()));
			}
		});

		// Añadir estaciones:
		for (Map.Entry<Integer, Estacion> rojos : in.rojo.entrySet()) {
			cbLista1.addItem(String.valueOf(rojos.getKey()));
			cbLista2.addItem(String.valueOf(rojos.getKey()));
		}
		for (Map.Entry<Integer, Estacion> azules : in.azul.entrySet()) {
			cbLista1.addItem(String.valueOf(azules.getKey()));
			cbLista2.addItem(String.valueOf(azules.getKey()));
		}
		for (Map.Entry<Integer, Estacion> verdes : in.verde.entrySet()) {
			cbLista1.addItem(String.valueOf(verdes.getKey()));
			cbLista2.addItem(String.valueOf(verdes.getKey()));
		}

		// Lista estaciones
		JTextPane textoRecorrido = new JTextPane();
		textoRecorrido.setText("Lista");
		textoRecorrido.setFont(common);
		textoRecorrido.setEditable(false);
		textoRecorrido.setBounds(95, 20, 350, 460);
		textoRecorrido.setVisible(false);
		contentPane.add(textoRecorrido);

		// Distancia
		JTextArea distancia = new JTextArea();
		distancia.setText("Distancia");
		distancia.setFont(common);
		distancia.setEditable(false);
		distancia.setBounds(95, 490, 350, 20);
		distancia.setVisible(false);
		contentPane.add(distancia);

		// Tiempo
		JTextArea tiempo = new JTextArea();
		tiempo.setText("Tiempo");
		tiempo.setFont(common);
		tiempo.setEditable(false);
		tiempo.setBounds(95, 520, 350, 20);
		tiempo.setVisible(false);
		contentPane.add(tiempo);

		// boton buscar
		JButton btnBuscar = new JButton("BUSCAR");
		btnBuscar.setFont(common);
		btnBuscar.setBackground(java.awt.Color.gray);
		btnBuscar.setForeground(Color.white);
		btnBuscar.setIconTextGap(-70);
		btnBuscar.setBounds(220, 170+x, 100, 20);
		contentPane.add(btnBuscar);

		// boton Volver
		JButton btnVolver = new JButton("NUEVA BÚSQUEDA");
		btnVolver.setFont(common);
		btnVolver.setBackground(java.awt.Color.gray);
		btnVolver.setForeground(Color.white);
		btnVolver.setBounds(170, 560, 200, 20);
		btnVolver.setVisible(false);
		contentPane.add(btnVolver);
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textoRecorrido.setText("");
				btnVolver.setVisible(false);
				textoRecorrido.setVisible(false);
				tiempo.setVisible(false);
				distancia.setVisible(false);
				btnBuscar.setVisible(true);
				lblOrigen.setVisible(true);
				lblDestino.setVisible(true);
				cbLista1.setVisible(true);
				cbLista2.setVisible(true);
			}
		});

		btnBuscar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				origen.g = 0;
				Estacion res = Busqueda.aEstrella(origen, destino);
				ArrayList<Estacion> a = Busqueda.printPath(res);

				String recorrido = "";

				for (Estacion e : a) {
					recorrido += e.getId();
					recorrido += "\n";
				}
				double dist = Geografia.getDistancia(a);
				DecimalFormat formato = new DecimalFormat("0.00");
				distancia.setText(" " + formato.format(dist) + " metros de trayecto");
				if (origen.equals(destino)) tiempo.setText(" 0 segundos de trayecto");
				else tiempo.setText(" " + (int)Geografia.getTiempo(dist, a.size()) + " segundos de trayecto");

				textoRecorrido.setText(recorrido);

				btnBuscar.setVisible(false);
				lblOrigen.setVisible(false);
				lblDestino.setVisible(false);
				cbLista1.setVisible(false);
				cbLista2.setVisible(false);
				textoRecorrido.setVisible(true);
				btnVolver.setVisible(true);
				tiempo.setVisible(true);
				distancia.setVisible(true);

			}
		});
	}

}
