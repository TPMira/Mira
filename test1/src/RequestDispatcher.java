import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public interface RequestDispatcher{
	void forward(ServletRequest request, ServletResponse response);
}
	

