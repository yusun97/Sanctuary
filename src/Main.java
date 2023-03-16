import controller.ControllerImpl;
import model.SanctuaryImpl;
import view.ViewImpl;

/**
 * Run the sanctuary program.
 */
public class Main {
  public static void main(String[] args) {
    SanctuaryImpl model = new SanctuaryImpl();
    ViewImpl view = new ViewImpl("Sanctuary");
    ControllerImpl controller = new ControllerImpl(model,view);
  }
}
