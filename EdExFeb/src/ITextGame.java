/**
 * En esta clase se define las acciones del juego
 * @author alu20466180k
 *
 */
public interface ITextGame {
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
	 * metodo para pausar
	 * @param force
	 */
	public void pause(Boolean force);
	/**
	 * metodo para obtener la pantalla
	 * @return
	 */
	public IScreen getScreen();
}
