package TecGurus.Test;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.tecgurus.utils.Locators;
import com.tecgurus.utils.Properties;

public class PeliculaEso {              //clase


	public static void main(String[] args) {     	//Es un metodo de la clase invocado/llamado  punto de entrada a la clase
		
		System.setProperty(Properties.CHROME_DRIVER_PROPERTY,       //metodo statico de la clase system
				Properties.CHROME_DRIVER_PATH);
		
		WebDriver driver = new ChromeDriver () ;    //arrancando el browser
		driver.manage().timeouts().implicitlyWait(Properties.TIMEOUT, TimeUnit.SECONDS);     //tiempo de espera para cargar elemetos
		
		driver.navigate().to(Properties.IMDB_URL) ; //metodo para navegar a la url
		
		//verificar que este la caja de busqueda
		
		WebElement searchBox = driver.findElement(Locators.SEARCH_BOX_ID);   //metodo manda la orden buscar y esncontrar buscar algun elemento fijo
		WebElement searchButton = driver.findElement(Locators.SEARCH_BUTTON_ID);	//metodo manda la orden buscar y esncontrar buscar algun elemento fijo
		if(searchBox.isDisplayed() && searchButton.isDisplayed() ){  //condicion para que searchbox y searchbutton de  estar o no regresen un string
			System.out.println("Verificacion y campo pasada");  //print message (Field and verication passed)
		}else{
			System.out.println("Verificacion y campo fallo");	//print message (Field and verification failed)
			System.exit(-1);
		}
	
			
			//Type IT in search box and click on search button
		
		
		searchBox.clear();		//Clear the serach box
		searchBox.sendKeys(Locators.ESO_MOVIE_INI);		//Type over the search box
		searchButton.click();	//Click over the search button 
		
		//verificar que se desplieguen tres resultados bajo la seecion de Titles
		
		List<WebElement> resultList = driver.findElements(Locators.MOVIE_RESULT_LIST);
		resultList.size();	//metodo que llama a verificar por xpath que si desplieguen los 3 resultado de la busqueda anterior
		if(resultList.size()==Properties.NUMBER_RESULTS_EXPECTED){	//Condicion del metodo  que pregunta si la lista de resultados se desplego?
			System.out.println("Verificacion de # peliculas pasada");  //Imprime un mensaje desde la condicion if argumentando que paso la prueba
		}else{	//Condicion que argumenta... sino... 
			System.out.println("Verificaion de # de peliculas fallo");	//Imprime un mensaje desde la condicion if argumentando que fallo la prueba
			
		}
		
		//Seleccionar le link de la versio de 1990
		
		for(int i = 0 ;  i < resultList.size() ; i++ ) {   //Ciclo for que hace que b
			WebElement e = resultList.get(i);
			System.out.println(e.getText());
			if(e.getText().contains(Properties.MOVIE_YEAR)){
				System.out.println("Elemento Correcto"); 
				WebElement correctLink = e.findElement(By.xpath(".//a"));	// Buscar elemento por xpath dando salto hasta los tags el punto antes de los slash 
				correctLink.click();	// Preguntar por que hasta que le di la orden/variable? salio del error 
				//Validar que se muestren los tres nombres del cast principal
				break;



			}	//Corchete del metodo constructor

		}	//Corchete de la calse principal


		//				navegar imdb.com
		//				verificar el campo

		
		
	}
	
	
	
	
	
	
}
		
		