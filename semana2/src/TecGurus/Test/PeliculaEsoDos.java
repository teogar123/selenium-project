package TecGurus.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.tecgurus.utils.Locators;
import com.tecgurus.utils.Properties;

public class PeliculaEsoDos {

	static WebDriver driver;




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;	//?? variable para que
		setUp();

		testeMovie();
		tearDown();
		System.out.println(a);

	}

	private static void setUp() {
		// TODO Auto-generated method stub
		int a = 4;  //???   esta variable para que es
		System.out.println(a);
		System.setProperty(Properties.CHROME_DRIVER_PROPERTY,       //metodo statico de la clase system
				Properties.CHROME_DRIVER_PATH);

		driver = new ChromeDriver () ;    //arrancando el browser
		driver.manage().timeouts().implicitlyWait(Properties.TIMEOUT, TimeUnit.SECONDS);     //tiempo de espera para cargar elemetos

		driver.navigate().to(Properties.IMDB_URL) ; //metodo para navegar a la url





	}

	private static void testeMovie() {
		// TODO Auto-generated method stub

		//Type IT in search box and click on search button
		//verificar que este la caja de busqueda

		WebElement searchBox = driver.findElement(Locators.SEARCH_BOX_ID);   //metodo manda la orden buscar y esncontrar buscar algun elemento fijo
		WebElement searchButton = driver.findElement(Locators.SEARCH_BUTTON_ID);	//metodo manda la orden buscar y esncontrar buscar algun elemento fijo
		if(searchBox.isDisplayed() && searchButton.isDisplayed() ){  //condicion para que searchbox y searchbutton de  estar o no regresen un string
			System.out.println("Verificacion y campo pasada");  //print message (Field and verication passed)
		}else{
			System.out.println("Verificacion y campo fallo");	//print message (Field and verification failed)
			System.exit(-1);
		}	

		searchBox.clear();		//Clear the serach box
		searchBox.sendKeys(Locators.ESO_MOVIE_INI);		//Type over the search box
		searchButton.click();	//Click over the search button 

		//verificar que se desplieguen tres resultados bajo la seccion de Titles

		List<WebElement> resultList = driver.findElements(Locators.MOVIE_RESULT_LIST);	//nos busca elementos como listas
		resultList.size();	//metodo que llama a verificar por xpath que si desplieguen los 3 resultado de la busqueda anterior
		if(resultList.size()==Properties.NUMBER_RESULTS_EXPECTED){	//Condicion del metodo  que pregunta si la lista de resultados se desplego?
			System.out.println("Verificacion de # peliculas pasada");  //Imprime un mensaje desde la condicion if argumentando que paso la prueba
		}else{	//Condicion que argumenta... sino... 
			System.out.println("Verificaion de # de peliculas fallo");	//Imprime un mensaje desde la condicion if argumentando que fallo la prueba

		}

		//Seleccionar le link de la versio de 1990

		for(int i = 0 ;  i < resultList.size() ; i++ ) {   //Ciclo for que hace que buscque el elemento hasta encontralo por medio de un array de tres
			WebElement e = resultList.get(i);	//En esta line a de codigo esta solicitando el resultado de i
			System.out.println(e.getText());	//En esta linea umprime en consola 
			if(e.getText().contains(Properties.MOVIE_YEAR)){
				System.out.println("Elemento Correcto"); 
				WebElement correctLink = e.findElement(By.xpath(".//a"));	// Buscar elemento por xpath dando salto hasta los tags el punto antes de los slash 
				correctLink.click();	// Preguntar por que hasta que le di la orden/variable? salio del error 
				//Validar que se muestren los tres nombres del cast principal
				break;
			}
		}	



		//Verify if the "main cast" is displayed


		WebElement starOne = driver.findElement(By.xpath(Locators.RICHARD_LOCATOR));	//Verify the element is displayed
		WebElement starTwo = driver.findElement(By.xpath(Locators.TIM_LOCATOR));	//Verify the element is displayed
		WebElement starThree = driver.findElement(By.xpath(Locators.ANNETTE_LOCATOR));	//verify if the element is displayed
		if(starOne.isDisplayed() && starTwo.isDisplayed() && starThree.isDisplayed() ){	//Condicion para verificar si los 3 elementos principales del cast estan desplegados
			System.out.println("Verication passed");
		}else{System.out.println("verification failed");
			System.exit(-1);
		}

		//Click on full cast and crew

		WebElement fullcast = driver.findElement(By.xpath(Locators.FULL_CAST));	//importante la sintaxis
		fullcast.click(); //click on the webElement






		String [] actorNames = {"Harry Aderson","Denis Christopher","Richar Masur","Annette O'Tooll ","tim Reid"};
		String [] characterNames = {"Richie Tozsier","Eddie Kaspbrak","Stanley Ubris","Beberly Marsh","Mike Hanlon"};

		for(int j = 0; j < actorNames.length; j++) {

			String xpathColumnaActor =
					"//table[@class='cast_list']//td[@class='itemprop']";

			WebElement actor =
					driver.findElement(By.xpath(xpathColumnaActor+"//span[text() = '" + actorNames[j] +"']"));

			WebElement character =
					driver.findElement(By.xpath(xpathColumnaActor+"/following-sibling::td[@class='character']//a[text()='"+ characterNames[j]+ "']"));

			if(actor.isDisplayed() && character.isDisplayed()) {
				System.out.println("Actor" + actorNames[j] + "character" + characterNames + " is displayed." );
			}
		}	

		//Harry Anderson			Richie Tozier
		//WebElement harryanderson = driver.findElement(By.xpath());
		//Denis Christopher		Eddie Kaspbrak
		//Richard Masur			Stanley Uris
		//Annette O'Tooll		Beverly Marsh
		//Tim Reid				Mike Hanlon
		//Jonathan Bradis		Bil Denbrough-age12
		//Brandon Crane			Ben Hanscon-age12
		//Joh Ritter			Ben Hanscom
		//Richard Thomas		Bill Denbrough
		//Adam Faraizl			Eddie Kaspb






	}

	private static void tearDown() {
		// TODO Auto-generated method stub
		driver.close();
		driver.quit();
		
		

	}





}
	
	
	
	

	
	
		
	

	


		
	


