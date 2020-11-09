package tools;

import java.util.Calendar;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;


public class Datas {

	public String gerarData() {

		Calendar c = Calendar.getInstance();
		Date data = c.getTime();

		// Data resumida
		DateFormat dt = DateFormat.getDateInstance(DateFormat.SHORT);

		String dtFinal = "" + dt.format(data);
		dtFinal = dtFinal.replace(" ", ""); // tira espaço em branco
		dtFinal = dtFinal.replace(".", ""); // tira ponto
		dtFinal = dtFinal.replace("/", ""); // tira barra
		return dtFinal = dtFinal.replace("-", "");

		//System.out.println(dtFinal);
	}
	public String gerarHoraCompleta()  {
		int hora, minutos, segundos;
		
		Calendar calendario = Calendar.getInstance();
		
		
		hora = calendario.get(Calendar.HOUR_OF_DAY);
		minutos = calendario.get(Calendar.MINUTE);
		segundos = calendario.get(Calendar.SECOND);
		
		//System.out.println(hora + "/" + minutos + "/" + segundos);
		
		String horaCompleta = (hora + "/" + minutos + "/" + segundos);
		return horaCompleta;
	}
}
