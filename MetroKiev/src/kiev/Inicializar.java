package kiev;

import java.util.TreeMap;

import grafoPonderado.Estacion;

public class Inicializar {
	
	public TreeMap<Integer, Estacion> rojo;
	public TreeMap<Integer, Estacion> azul;
	public TreeMap<Integer, Estacion> verde;

	public Inicializar() {

		// Linea 1 (rojo)
		rojo = new TreeMap<Integer, Estacion>();
		rojo.put(110, new Estacion(110, 50.46675134432641, 30.380663082803608));
		rojo.put(111, new Estacion(111, 50.455890286994475, 30.36501079767864));
		rojo.put(112, new Estacion(112, 50.45790408886472, 30.390678655349387));
		rojo.put(113, new Estacion(113, 50.45877925598508, 30.404372997678806));
		rojo.put(114, new Estacion(114, 50.45949536578298, 30.418625568843478));
		rojo.put(115, new Estacion(115, 50.454310051290605, 30.44861146884321));
		rojo.put(116, new Estacion(116, 50.45128680228216, 30.464347141855207));
		rojo.put(117, new Estacion(117, 50.44149926763331, 30.489909353501183));
		rojo.put(118, new Estacion(118, 50.44342542838661, 30.504620568842768));
		rojo.put(119, new Estacion(119, 50.44496378798153, 30.515577641854982));
		rojo.put(120, new Estacion(120, 50.44740110719471, 30.5217228976783));
		rojo.put(121, new Estacion(121, 50.44294636055214, 30.544760740007344));
		rojo.put(122, new Estacion(122, 50.44139880084812, 30.559326168842688));
		rojo.put(123, new Estacion(123, 50.44614195154741, 30.57689472651362));
		rojo.put(124, new Estacion(124, 50.45201426853427, 30.59817855534915));
		rojo.put(125, new Estacion(125, 50.45614923982398, 30.612980826513912));
		rojo.put(126, new Estacion(126, 50.460014922422104, 30.630270540008134));
		rojo.put(127, new Estacion(127, 50.46486466355096, 30.64556569767896));

		// Linea azul
		azul = new TreeMap<Integer, Estacion>();
		azul.put(210, new Estacion(210, 50.52288047829431, 30.49890367768997));
		azul.put(211, new Estacion(211, 50.512398899252396, 30.498615370693017));
		azul.put(212, new Estacion(212, 50.50168641069756, 30.49823119768045));
		azul.put(213, new Estacion(213, 50.4862701180185, 30.497783624667637));
		azul.put(214, new Estacion(214, 50.47416322630182, 30.50389439952686));
		azul.put(215, new Estacion(215, 50.46606469459744, 30.51499238233751));
		azul.put(216, new Estacion(216, 50.45943973572903, 30.524401268843377));
		azul.put(217, new Estacion(217, 50.448307039656186, 30.524939424666158));
		azul.put(218, new Estacion(218, 50.44034010561346, 30.51841218418406));
		azul.put(219, new Estacion(219, 50.431473805267174, 30.516933070689774));
		azul.put(220, new Estacion(220, 50.421597643754005, 30.520795884183283));
		azul.put(221, new Estacion(221, 50.41413982560632, 30.524874068841562));
		azul.put(222, new Estacion(222, 50.404972608528695, 30.51694309952403));
		azul.put(223, new Estacion(223, 50.397506584819126, 30.508239968840925));
		azul.put(224, new Estacion(224, 50.393529332662055, 30.48819399767603));
		azul.put(225, new Estacion(225, 50.38260571294548, 30.477526353498845));
		azul.put(226, new Estacion(226, 50.37675257624713, 30.46882304000469));
		azul.put(227, new Estacion(227, 50.36725499404028, 30.45415042651039));

		// Linea verde
		verde = new TreeMap<Integer, Estacion>();
		verde.put(310, new Estacion(310, 50.47687785085057, 30.432714724667335));
		verde.put(311, new Estacion(311, 50.47361987683422, 30.449178622258284));
		verde.put(312, new Estacion(312, 50.46129050907531, 30.483610940008134));
		verde.put(314, new Estacion(314, 50.445979784314495, 30.51511208233678));
		verde.put(315, new Estacion(315, 50.43987130710226, 30.519453811171854));
		verde.put(316, new Estacion(316, 50.437146349676524, 30.531806997677865));
		verde.put(317, new Estacion(317, 50.42749239517829, 30.539355082335977));
		verde.put(318, new Estacion(318, 50.41721072448792, 30.547338455347774));
		verde.put(319, new Estacion(319, 50.402013458610455, 30.560434353499627));
		verde.put(321, new Estacion(321, 50.39449312684462, 30.604907313017577));
		verde.put(322, new Estacion(322, 50.395391608815714, 30.61624172651145));
		verde.put(323, new Estacion(323, 50.39806935279271, 30.634712911170155));
		verde.put(324, new Estacion(324, 50.400867563239636, 30.65204658233494));
		verde.put(325, new Estacion(325, 50.403120838957186, 30.666878811170445));
		verde.put(326, new Estacion(326, 50.40352240752366, 30.684327911170417));
		verde.put(327, new Estacion(327, 50.409664427699916, 30.696181540006));

		//CONEXIONES
		rojo.get(110).nuevaConexion(rojo.get(111));
		rojo.get(111).nuevaConexion(rojo.get(112));
		rojo.get(112).nuevaConexion(rojo.get(113));
		rojo.get(113).nuevaConexion(rojo.get(114));
		rojo.get(114).nuevaConexion(rojo.get(115));
		rojo.get(115).nuevaConexion(rojo.get(116));
		rojo.get(116).nuevaConexion(rojo.get(117));
		rojo.get(117).nuevaConexion(rojo.get(118));
		rojo.get(118).nuevaConexion(rojo.get(119));
		rojo.get(119).nuevaConexion(rojo.get(120));
		rojo.get(120).nuevaConexion(rojo.get(121));
		rojo.get(121).nuevaConexion(rojo.get(122));
		rojo.get(122).nuevaConexion(rojo.get(123));
		rojo.get(123).nuevaConexion(rojo.get(124));
		rojo.get(124).nuevaConexion(rojo.get(125));
		rojo.get(125).nuevaConexion(rojo.get(126));
		rojo.get(126).nuevaConexion(rojo.get(127));

		azul.get(210).nuevaConexion(azul.get(211));
		azul.get(211).nuevaConexion(azul.get(212));
		azul.get(212).nuevaConexion(azul.get(213));
		azul.get(213).nuevaConexion(azul.get(214));
		azul.get(214).nuevaConexion(azul.get(215));
		azul.get(215).nuevaConexion(azul.get(216));
		azul.get(216).nuevaConexion(azul.get(217));
		azul.get(217).nuevaConexion(azul.get(218));
		azul.get(218).nuevaConexion(azul.get(219));
		azul.get(219).nuevaConexion(azul.get(220));
		azul.get(220).nuevaConexion(azul.get(221));
		azul.get(221).nuevaConexion(azul.get(222));
		azul.get(222).nuevaConexion(azul.get(223));
		azul.get(223).nuevaConexion(azul.get(224));
		azul.get(224).nuevaConexion(azul.get(225));
		azul.get(225).nuevaConexion(azul.get(226));
		azul.get(226).nuevaConexion(azul.get(227));

		verde.get(310).nuevaConexion(verde.get(311));
		verde.get(311).nuevaConexion(verde.get(312));
		verde.get(312).nuevaConexion(verde.get(314));
		verde.get(314).nuevaConexion(verde.get(315));
		verde.get(315).nuevaConexion(verde.get(316));
		verde.get(316).nuevaConexion(verde.get(317));
		verde.get(317).nuevaConexion(verde.get(318));
		verde.get(318).nuevaConexion(verde.get(319));
		verde.get(319).nuevaConexion(verde.get(321));
		verde.get(321).nuevaConexion(verde.get(322));
		verde.get(322).nuevaConexion(verde.get(323));
		verde.get(323).nuevaConexion(verde.get(324));
		verde.get(324).nuevaConexion(verde.get(325));
		verde.get(325).nuevaConexion(verde.get(326));
		verde.get(326).nuevaConexion(verde.get(327));

		verde.get(314).nuevaConexion(rojo.get(119));

		azul.get(217).nuevaConexion(rojo.get(120));

		verde.get(315).nuevaConexion(azul.get(218));
		
		rojo.get(111).nuevaConexion(rojo.get(110));
		rojo.get(112).nuevaConexion(rojo.get(111));
		rojo.get(113).nuevaConexion(rojo.get(112));
		rojo.get(114).nuevaConexion(rojo.get(113));
		rojo.get(115).nuevaConexion(rojo.get(114));
		rojo.get(116).nuevaConexion(rojo.get(115));
		rojo.get(117).nuevaConexion(rojo.get(116));
		rojo.get(118).nuevaConexion(rojo.get(117));
		rojo.get(119).nuevaConexion(rojo.get(118));
		rojo.get(120).nuevaConexion(rojo.get(119));
		rojo.get(121).nuevaConexion(rojo.get(120));
		rojo.get(122).nuevaConexion(rojo.get(121));
		rojo.get(123).nuevaConexion(rojo.get(122));
		rojo.get(124).nuevaConexion(rojo.get(123));
		rojo.get(125).nuevaConexion(rojo.get(124));
		rojo.get(126).nuevaConexion(rojo.get(125));
		rojo.get(127).nuevaConexion(rojo.get(126));		
		
		azul.get(211).nuevaConexion(azul.get(210));
		azul.get(212).nuevaConexion(azul.get(211));
		azul.get(213).nuevaConexion(azul.get(212));
		azul.get(214).nuevaConexion(azul.get(213));
		azul.get(215).nuevaConexion(azul.get(214));
		azul.get(216).nuevaConexion(azul.get(215));
		azul.get(217).nuevaConexion(azul.get(216));
		azul.get(218).nuevaConexion(azul.get(217));
		azul.get(219).nuevaConexion(azul.get(218));
		azul.get(220).nuevaConexion(azul.get(219));
		azul.get(221).nuevaConexion(azul.get(220));
		azul.get(222).nuevaConexion(azul.get(221));
		azul.get(223).nuevaConexion(azul.get(222));
		azul.get(224).nuevaConexion(azul.get(223));
		azul.get(225).nuevaConexion(azul.get(224));
		azul.get(226).nuevaConexion(azul.get(225));
		azul.get(227).nuevaConexion(azul.get(226));
		
		verde.get(311).nuevaConexion(verde.get(310));
		verde.get(312).nuevaConexion(verde.get(311));
		verde.get(314).nuevaConexion(verde.get(312));
		verde.get(315).nuevaConexion(verde.get(314));
		verde.get(316).nuevaConexion(verde.get(315));
		verde.get(317).nuevaConexion(verde.get(316));
		verde.get(318).nuevaConexion(verde.get(317));
		verde.get(319).nuevaConexion(verde.get(318));
		verde.get(321).nuevaConexion(verde.get(319));
		verde.get(322).nuevaConexion(verde.get(321));
		verde.get(323).nuevaConexion(verde.get(322));
		verde.get(324).nuevaConexion(verde.get(323));
		verde.get(325).nuevaConexion(verde.get(324));
		verde.get(326).nuevaConexion(verde.get(325));
		verde.get(327).nuevaConexion(verde.get(326));

		rojo.get(119).nuevaConexion(verde.get(314));

		rojo.get(120).nuevaConexion(azul.get(217));

		azul.get(218).nuevaConexion(verde.get(315));
		
		
	}

	public Estacion getEstacionByID(int id) {
		Estacion res = null;
		int digitoInicial = Integer.parseInt((id + "").charAt(0) + "");
		switch (digitoInicial) {
		case 1:
			if (rojo.containsKey(id)) res = rojo.get(id);
			break;
		case 2:
			if (azul.containsKey(id)) res = azul.get(id);
			break;
		case 3:
			if (verde.containsKey(id)) res = verde.get(id);
			break;
		default:
			System.out.println("Aviso: el id introducido no corresponde a ninguna estación.");
		}
		return res;
	}
}