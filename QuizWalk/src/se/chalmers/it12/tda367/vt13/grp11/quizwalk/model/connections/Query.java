package se.chalmers.it12.tda367.vt13.grp11.quizwalk.model.connections;

/**
 * A server Query. The query should contain a command, defined
 * {@link se.chalmers.it12.tda367.vt13.grp11.quizwalk.model.utils.Constants.DatabaseQuery}
 * Create a query and use it to pass it to some Class implementing
 * {@link Repository}
 * 
 */
public interface Query {

	/**
	 * @return A string query. Will usually be some command that a Server can
	 *         parse.
	 */
	public String getQuery();

}
