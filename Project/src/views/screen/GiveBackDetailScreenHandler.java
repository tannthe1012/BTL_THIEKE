package views.screen;

import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Logger;

import controller.PaymentController;
import entity.RentalDeal;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import utils.Configs;
import utils.Utils;


public class GiveBackDetailScreenHandler extends BaseScreenHandler {
	
	private static Logger LOGGER = Utils.getLogger(GiveBackDetailScreenHandler.class.getName());
	
	@FXML
	private Label fullName;
	
	@FXML
	private Label bikeCode;
	
	@FXML
	private Label timeStart;
	
	@FXML
	private Label sumTimeRent;
	
	@FXML
	private Label totalPrice;
	
	@FXML
	private Label phoneNumber;
	
	@FXML
	private Label timeEnd;
	
	private RentalDeal rentaldeal;

	public GiveBackDetailScreenHandler(Stage stage, String screenPath, RentalDeal rentaldeal) throws IOException {
		super(stage, screenPath);
		this.rentaldeal = rentaldeal;
		// set up detail
		setUpDetailRentDealBike(rentaldeal);
		
		
		// TODO Auto-generated constructor stub
	}
	/***
	 * Method set up info deal bike
	 * Created By: NTTan - 20183980
	 */
	private void setUpDetailRentDealBike(RentalDeal rentaldeal) {
		// TODO Auto-generated method stub
		Date date = new Date(1);
//		DateFormat df = new SimpleDateFormat(pattern);
		fullName.setText(rentaldeal.getUser().getName());
		bikeCode.setText(rentaldeal.getBike().getBikeCode());
//		timeStart.setText(date.toString());
		timeStart.setText(rentaldeal.getBeginingTime().toGMTString());
		sumTimeRent.setText(date.toString());
		totalPrice.setText("100.000 VND");
		phoneNumber.setText(rentaldeal.getUser().getPhone());
		// time end
		
		timeEnd.setText(date.toString());
	}
	
	
	@FXML
	void cancelPaymentDetail(MouseEvent event) throws IOException {
//		BaseScreenHandler paymentScreen = new PaymentScreenHandler(this.stage, Configs.PAYMENT_SCREEN_PATH, invoice);
//		paymentScreen.setBController(new PaymentController());
//		paymentScreen.setPreviousScreen(this);
//		paymentScreen.setHomeScreenHandler(homeScreenHandler);
//		paymentScreen.setScreenTitle("Payment Screen");
//		paymentScreen.show();
//		LOGGER.info("Confirmed invoice");
		System.out.println("HJHHAHAHAHAHAH");
	}
	
	@FXML
	void confirmPaymentDetail(MouseEvent event) throws IOException {
		System.out.println("Tan");
	}
	
	
}
