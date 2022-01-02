import java.io.IOException;
import java.security.Timestamp;
//import java.sql.Date;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import entity.Bike;
import entity.BikeType;
import entity.RentalDeal;
import entity.Station;
import entity.User;
import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;
import utils.Configs;
import views.screen.GiveBackDetailScreenHandler;

public class App extends Application {

	@FXML
	ImageView logo;

	@Override
	public void start(Stage primaryStage) {
//		try {

//			// initialize the scene
//			StackPane root = (StackPane) FXMLLoader.load(getClass().getResource(Configs.SPLASH_SCREEN_PATH));
//			Scene scene = new Scene(root);
//			primaryStage.setScene(scene);
//			primaryStage.show();
//
//			// Load splash screen with fade in effect
//			FadeTransition fadeIn = new FadeTransition(Duration.seconds(2), root);
//			fadeIn.setFromValue(0);
//			fadeIn.setToValue(1);
//			fadeIn.setCycleCount(1);
//
//			// Finish splash with fade out effect
//			FadeTransition fadeOut = new FadeTransition(Duration.seconds(1), root);
//			fadeOut.setFromValue(1);
//			fadeOut.setToValue(0);
//			fadeOut.setCycleCount(1);
//
//			// After fade in, start fade out
//			fadeIn.play();
//			fadeIn.setOnFinished((e) -> {
//				fadeOut.play();
//			});

		// After fade out, load actual content
//			fadeOut.setOnFinished((e) -> {
//				try {
//					GiveBackDetailScreenHandler giveBackDetail = new GiveBackDetailScreenHandler(primaryStage, Configs.GIVE_BACK_DETAIL);
////					giveBackDetail.setScreenTitle("Home Screen");
////					giveBackDetail.setImage();
////					giveBackDetail.show();
//				} catch (IOException e1) {
//					e1.printStackTrace();
//				}
//			});
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		System.out.print("tan111");
		try {
//			String date_string = "26-09-1989";
//		       //Instantiating the SimpleDateFormat class
//		       SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");      
//		       //Parsing the given String to Date object
//		       Date date = (Date) formatter.parse(date_string);      
//		       System.out.println("Date value: "+date);
//			System.out.print("tana");
			Date date = new Date(2021-1900,6-1,5+1,10-17, 0, 0);
			Station s = new Station(1, "Quoc gia my dinh", "Ha noi", "siiiiii", 5, 5, 3, null);
			BikeType bt = new BikeType(0, "Moaa", 0, 0, "JOAA");

			Bike b = new Bike(0, s, bt, "OAOUIQ", "AOAOA", "OAIAIA", "QUUQA", 5, 6, date, "AOIAI", 2, 7, 9, 1);
			User user = new User(12, "Tan", "ngotheatn2k@gmail.com", "Viet Hung", "019278327", 1);
			RentalDeal rd = new RentalDeal(0, b, user, date, 0);
			System.out.print("ta2n");
			GiveBackDetailScreenHandler giveBackDetail = new GiveBackDetailScreenHandler(primaryStage,
					Configs.GIVE_BACK_DETAIL, rd);
			giveBackDetail.setScreenTitle("Home Screen");
//			giveBackDetail.setImage();
			giveBackDetail.show();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print(e.getMessage());
		}
	}

	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.of(2021, 2, 12, 7, 2);

//		System.out.println(dtf.format(now));
//		Date date = new Date(2021, 0, 0)
//		@SuppressWarnings("deprecation")
//		Date date = new Date(2021, 2, 5, 6, 7);
//		System.out.println(dtf.format(now));
		launch(args);
	}

}
