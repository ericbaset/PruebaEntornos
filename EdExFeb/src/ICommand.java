/**
 * En esta clase se definen los comandos
 * @author alu20466180k
 *
 */
public interface ICommand {
	/**
	 * metodo para crear un comando
	 * @param string
	 * @return
	 */
	public Boolean create(String string);
	/**
	 * metodo para iniciar un comando
	 * @return
	 */
	public Boolean run();
}
