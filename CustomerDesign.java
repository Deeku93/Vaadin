package my.vaadin.vaadintest;

import javax.swing.text.DefaultEditorKit.CutAction;

import com.vaadin.ui.Button;
import com.vaadin.ui.DateField;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.NativeSelect;
import com.vaadin.ui.TextField;

public class CustomerDesign extends FormLayout {
	
	private TextField firstName = new TextField("First name");
	private TextField lastName = new TextField("Last name");
	private TextField email = new TextField("Email");
	private NativeSelect<CustomerStatus> status = new NativeSelect<>("Status");
	private DateField birthdate = new DateField("Birthday");
	private Button save = new Button("Save");
	private Button delete = new Button("Delete");
	
	private CustomerService service =CustomerService.getInstance();
	private Customer customer;
	private MyUI myUI;
	
	public CustomerDesign(MyUI myUI) {
		
		this.myUI = myUI;
		setSizeUndefined();
		HorizontalLayout buttons= new HorizontalLayout(save,delete);
		addComponents(firstName,lastName,email,status,birthdate,buttons);
		
		status.setItems(CustomerStatus.values());
		
	}

}
