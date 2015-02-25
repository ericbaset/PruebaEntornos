/**
 * Esta clase define la pantalla
 * @author alu20466180k
 *
 */
public interface IScreen {
/**
 * metodo para obtener el ancho de la pantalla
 * @return
 */
	public int getWidth();
	/**
	 * metodo para introducir el ancho de la pantalla
	 * @param width
	 */
	public void setWidth(int width);
	/**
	 * metodo para obtener la altura de la pantalla
	 * @return
	 */
	public int getHeight();
	/**
	 * metodo para introducir la altura de la pantalla
	 * @param height
	 */
	public void setHeight(int height);
	/**
	 * metodo para crear la pantalla
	 * @return
	 */
	public Boolean create();
	/**
	 * metodo para iniciar
	 */
	public void start();
	/**
	 * metodo para detener
	 * @param force
	 */
	public void stop(Boolean force);
	/**
	 * metodo para cerrar
	 * @param force
	 */
	public void close(Boolean force);
	/**
	 * metodo para leer
	 * @return
	 */
	public ICommand readCommand();
	/**
	 * metodo para ejecutar
	 * @param command
	 * @return
	 */
	public Boolean executeCommand(ICommand command);
}
