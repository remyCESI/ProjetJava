package model.dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Example;
import model.Map;

public abstract class mapdao extends AbstractDAO {
	/** The sql example by id. */
    private static String sqlshowMaps   = "{call showMaps(?)}";

    // The sql example by name. 
   // private static String sqlExampleByName = "{call findExampleByName(?)}";

    // The sql all examples. */
   // private static String sqlAllExamples   = "{call findAllExamples()}";

    // The id column index. */
   //showMaps private static int    idColumnIndex    = 1;

    //The name column index. */
    //private static int    nameColumnIndex  = 2;

    /**
     * Gets the example by id.
     *
     * @param id
     *            the id
     * @param idColumnIndex 
     * @param nameColumnIndex 
     * @return the example by id
     * @throws SQLException
     *             the SQL exception
     */
    public static Returnmap getMapById(final int id, String idColumnIndex, String nameColumnIndex) throws SQLException {
        final CallableStatement callStatement = prepareCal
        		l(sqlshowMaps);
        Returnmap map = null;
        callStatement.setInt(1, id);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();
            if (result.first()) {
                map = new Returnmap(result.getInt(idColumnIndex), result.getString(nameColumnIndex));
            }
            result.close();
        }
        return map;
    }
    }
