import ij.IJ;
import ij.plugin.PlugIn;

public class MyPlugin implements PlugIn {

    @Override
    public void run(String args) {
        IJ.showMessage("It Worked!");
    }
    
}
