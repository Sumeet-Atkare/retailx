package com.bnetworks.godownx.dao;

import java.util.Map ;
import java.util.HashMap ;
import java.sql.Connection ;
import java.sql.SQLException ;
import com.javaranch.common.Str ;
import com.javaranch.db.DBResults ;
import com.javaranch.db.TableFacade ;

/** Strongly typed access to the database table "product_stocks".
 *
 * This source file was automatically generated by "Jenny the db code generator"
 * based on information found in the database.  Do not modify this file!
 *
 * For more information on Jenny, see http://www.javaranch.com/jenny.jsp
 *
 *
 * Most of the methods are static so you don't need to instantiate a copy of this class 
 * to do your work.  The primary access methods are:
 * <ul>
 *
 *     <b>getRow()/getRows()/getAllRows()</b><br>
 *     <b>search() </b><i>like getRows(), but you can specify which columns you want back</i><br>
 *     <b>update()</b><br>
 *     <b>delete()</b><br>
 *     <b>insert()</b><br>
 *
 * </ul>
 *
 * These methods all have the option of passing in a connection as the first parameter.
 * Usually you won't use a connection directly, but sometimes it's useful.
 *
 * The getRows() methods all return an array of Row objects or a single Row object.  The
 * row object is easy to work with and provides strong type checking.  If your table has
 * a lot of columns, and your search will return a lot of rows, you might want to consider
 * using a search() method instead.  You lose some of your strong type checking, but 
 * you might go a lot easier on memory.  In these cases, you will want to make sure you
 * use the column name constants found at the top of this class.
 *
 */
public class Product_stocksTable
{

    private static Implementation imp = new Implementation();

    public static final String tableName = "product_stocks";

    public static final String idColumnName = "id";
    public static final String product_idColumnName = "product_id";
    public static final String bought_quantityColumnName = "bought_quantity";
    public static final String remaining_quantityColumnName = "remaining_quantity";
    public static final String commentsColumnName = "comments";
    public static final String buy_priceColumnName = "buy_price";
    public static final String sell_priceColumnName = "sell_price";
    public static final String purchase_dateColumnName = "purchase_date";

    private static String[] allColumns =
    {
        idColumnName , product_idColumnName , bought_quantityColumnName , remaining_quantityColumnName , commentsColumnName , buy_priceColumnName , sell_priceColumnName , purchase_dateColumnName , 
    };

    /** You probably want to use the static methods for most of your access, but once in a while you might need to
     *  pass an instance object to a method that knows how to work with these sorts of tables.
     */
    public static Implementation getInstance()
    {
        return imp ;
    }

    /** For use by unit testing, although you could provide your own implementation here if
     *  you wanted to.
     *  
     *  To use this in your unit testing, create an instance of MockProduct_stocksTable and pass
     *  it in here.  Then set your mock return values, call the method you are testing and examine
     *  the mock values that are now set!
     */
    public static void setInstance( Implementation instance  )
    {
        imp = instance ;
    }

    /** Exposed for unit testing purposes only! */
    static class Implementation extends TableFacade
    {

        /** Exposed for unit testing purposes only! */
        Implementation()
        {
            super( RetailXFacade.getInstance() , tableName );
        }

        // convert a DBResults object to an array of Row objects.
        // requires that all of the columns be represented in the DBResults object and in the right order
        private static Row[] rowArray( DBResults r )
        {
            Row[] rows = new Row[ r.size() ];
            for( int i = 0 ; i < rows.length ; i++ )
            {
                rows[ i ] = new Row( r.getRow( i ) );
            }
            return rows ;
        }

        /** Instantiate an empty Row object */
        public Row getRow()
        {
            // if you are wondering about why this method is so lame - it's for unit testing!
            // The idea is that during unit testing, a different test object will be returned here.
            // To learn more about unit testing with Jenny generated code, visit <a href="http://www.javaranch.com/jenny.jsp">www.javaranch.com/jenny.jsp</a>
            return new Row();
        }

        /** Instantiate a Row object and fill its content based on a search for the ID. 
         *
         * Return null if not found.  Return first item if more than one found.
         */
        public Row getRow( Connection con , int id ) throws SQLException
        {
            Row row = new Row( this.search( con , "id" , String.valueOf( id ) , allColumns ) );
            return row.dataLoadedFromDatabase() ? row : null ;
        }

        /** Instantiate a Row object and fill its content based on a search for the ID.
         *
         * Return null if not found.
         */
        public Row getRow( long id ) throws SQLException
        {
            Row row = new Row( this.search( "id" , String.valueOf( id ) , allColumns ) );
            return row.dataLoadedFromDatabase() ? row : null ;
        }

        /** Instantiate a Row object and fill its content based on a search
         *
         * Return null if not found.
         */
        public Row getRow( Connection con , String column , String searchText ) throws SQLException
        {
            Row row = new Row( this.search( con , column , searchText , allColumns ) );
            return row.dataLoadedFromDatabase() ? row : null ;
        }

        /** Instantiate a Row object and fill its content based on a search
         *
         * Return null if not found.
         */
        public Row getRow( String column , String searchText ) throws SQLException
        {
            Row row = new Row( this.search( column , searchText , allColumns ) );
            return row.dataLoadedFromDatabase() ? row : null ;
        }

        /** Return an array of length zero if nothing found */
        public Row[] getRows( Connection con , String column , String searchText ) throws SQLException
        {
            return rowArray( this.search( con , column , searchText , allColumns ) );
        }

        /** Return an array of length zero if nothing found */
        public Row[] getRows( String column , String searchText ) throws SQLException
        {
            return rowArray( this.search( column , searchText , allColumns ) );
        }

        /** Return an array of length zero if nothing found */
        public Row[] getRows( Connection con , String column , String[] searchText ) throws SQLException
        {
            return rowArray( this.search( con , column , searchText , allColumns ) );
        }

        /** Return an array of length zero if nothing found */
        public Row[] getRows( String column , String[] searchText ) throws SQLException
        {
            return rowArray( this.search( column , searchText , allColumns ) );
        }

        /** Return an array of length zero if nothing found */
        public Row[] getRows( Connection con , String whereClause ) throws SQLException
        {
            return rowArray( this.search( con , whereClause , allColumns ) );
        }

        /** Return an array of length zero if nothing found */
        public Row[] getRows( String whereClause ) throws SQLException
        {
            return rowArray( this.search( whereClause , allColumns ) );
        }

        /** Return an array of length zero if nothing found */
        public Row[] getAllRows( Connection con ) throws SQLException
        {
            return rowArray( this.search( con , allColumns ) );
        }

        /** Return an array of length zero if nothing found */
        public Row[] getAllRows() throws SQLException
        {
            return rowArray( this.search( allColumns ) );
        }

        public void update( Connection con , int id , Map data ) throws SQLException
        {
            this.update( con , "id" , String.valueOf( id ) , data );
        }

        public void update( int id , Map data ) throws SQLException
        {
            this.update( "id" , String.valueOf( id ) , data );
        }

        public void delete( Connection con , long id ) throws SQLException
        {
            this.delete( con , "id" , String.valueOf( id ) );
        }

        public void delete( long id ) throws SQLException
        {
            this.delete( "id" , String.valueOf( id ) );
        }

        public long insertAndGetID( Connection con , Map data ) throws SQLException
        {
            return this.insertAndGetID( con , data , "id" );
        }

        public long insertAndGetID( Map data ) throws SQLException
        {
            return this.insertAndGetID( data , "id" );
        }


    }

    public static class Row
    {

        private boolean dataLoadedFromDatabase = false ;

        private int id ;
        private int product_id ;
        private int bought_quantity ;
        private boolean bought_quantityNull = true ;
        private int remaining_quantity ;
        private boolean remaining_quantityNull = true ;
        private String comments ;
        private double buy_price ;
        private boolean buy_priceNull = true ;
        private double sell_price ;
        private boolean sell_priceNull = true ;
        private String purchase_date ;

        /** for internal use only!   If you need a row object, use getRow(). */
        Row()
        {
        }

        private Row( String[] data )
        {
            if ( data != null )
            {
                this.id =  Str.toInt( data[0] );
                this.product_id =  Str.toInt( data[1] );
                this.bought_quantityNull = ( data[2] == null );
                this.bought_quantity = bought_quantityNull ? 0 : Str.toInt( data[2] );
                this.remaining_quantityNull = ( data[3] == null );
                this.remaining_quantity = remaining_quantityNull ? 0 : Str.toInt( data[3] );
                this.comments = data[4];
                this.buy_priceNull = ( data[5] == null );
                this.buy_price = buy_priceNull ? 0.0 : Str.toDouble( data[5] );
                this.sell_priceNull = ( data[6] == null );
                this.sell_price = sell_priceNull ? 0.0 : Str.toDouble( data[6] );
                this.purchase_date = data[7];
                dataLoadedFromDatabase = true ;
            }
        }

        private Row( DBResults results )
        {
            this( results.getRow(0) );
        }

        public int getID()
        {
            return id ;
        }

        public void setID( int id )
        {
            this.id = id ;
        }


        public int getProduct_id()
        {
            return product_id ;
        }

        public void setProduct_id( int product_id )
        {
            this.product_id = product_id ;
        }


        public int getBought_quantity()
        {
            return bought_quantity ;
        }

        public void setBought_quantity( int bought_quantity )
        {
            this.bought_quantity = bought_quantity ;
            bought_quantityNull = false ;
        }

        public void setBought_quantity( Integer bought_quantity )
        {
            bought_quantityNull = ( bought_quantity == null );
            if ( bought_quantityNull )
            {
                this.bought_quantity = 0 ;
            }
            else
            {
                this.bought_quantity = bought_quantity.intValue() ;
            }
        }

        public boolean isBought_quantityNull()
        {
            return bought_quantityNull ;
        }

        public void setBought_quantityNull( boolean bought_quantityNull )
        {
            this.bought_quantityNull = bought_quantityNull ;
            if ( bought_quantityNull )
            {
                bought_quantity = 0 ;
            }
        }


        public int getRemaining_quantity()
        {
            return remaining_quantity ;
        }

        public void setRemaining_quantity( int remaining_quantity )
        {
            this.remaining_quantity = remaining_quantity ;
            remaining_quantityNull = false ;
        }

        public void setRemaining_quantity( Integer remaining_quantity )
        {
            remaining_quantityNull = ( remaining_quantity == null );
            if ( remaining_quantityNull )
            {
                this.remaining_quantity = 0 ;
            }
            else
            {
                this.remaining_quantity = remaining_quantity.intValue() ;
            }
        }

        public boolean isRemaining_quantityNull()
        {
            return remaining_quantityNull ;
        }

        public void setRemaining_quantityNull( boolean remaining_quantityNull )
        {
            this.remaining_quantityNull = remaining_quantityNull ;
            if ( remaining_quantityNull )
            {
                remaining_quantity = 0 ;
            }
        }


        public String getComments()
        {
            return comments ;
        }

        public void setComments( String comments )
        {
            this.comments = comments ;
        }


        public double getBuy_price()
        {
            return buy_price ;
        }

        public void setBuy_price( double buy_price )
        {
            this.buy_price = buy_price ;
            buy_priceNull = false ;
        }

        public void setBuy_price( Double buy_price )
        {
            buy_priceNull = ( buy_price == null );
            if ( buy_priceNull )
            {
                this.buy_price = 0.0 ;
            }
            else
            {
                this.buy_price = buy_price.doubleValue() ;
            }
        }

        public boolean isBuy_priceNull()
        {
            return buy_priceNull ;
        }

        public void setBuy_priceNull( boolean buy_priceNull )
        {
            this.buy_priceNull = buy_priceNull ;
            if ( buy_priceNull )
            {
                buy_price = 0.0 ;
            }
        }


        public double getSell_price()
        {
            return sell_price ;
        }

        public void setSell_price( double sell_price )
        {
            this.sell_price = sell_price ;
            sell_priceNull = false ;
        }

        public void setSell_price( Double sell_price )
        {
            sell_priceNull = ( sell_price == null );
            if ( sell_priceNull )
            {
                this.sell_price = 0.0 ;
            }
            else
            {
                this.sell_price = sell_price.doubleValue() ;
            }
        }

        public boolean isSell_priceNull()
        {
            return sell_priceNull ;
        }

        public void setSell_priceNull( boolean sell_priceNull )
        {
            this.sell_priceNull = sell_priceNull ;
            if ( sell_priceNull )
            {
                sell_price = 0.0 ;
            }
        }


        public String getPurchase_date()
        {
            return purchase_date ;
        }

        public void setPurchase_date( String purchase_date )
        {
            this.purchase_date = purchase_date ;
        }



        
        private boolean dataLoadedFromDatabase()
        {
            return dataLoadedFromDatabase ;
        }

        private Map buildDataMap()
        {
            Map data = new HashMap();
            data.put( idColumnName , String.valueOf(  this.id ) );
            data.put( product_idColumnName , String.valueOf(  this.product_id ) );
            data.put( bought_quantityColumnName , this.bought_quantityNull ? null : String.valueOf( this.bought_quantity ) );
            data.put( remaining_quantityColumnName , this.remaining_quantityNull ? null : String.valueOf( this.remaining_quantity ) );
            data.put( commentsColumnName , this.comments );
            data.put( buy_priceColumnName , this.buy_priceNull ? null : String.valueOf( this.buy_price ) );
            data.put( sell_priceColumnName , this.sell_priceNull ? null : String.valueOf( this.sell_price ) );
            data.put( purchase_dateColumnName , this.purchase_date );
            return data ;
        }

        /** update a row object based on a search */
        public void update( Connection con , String column , String searchText ) throws SQLException
        {
            imp.update( con , column , searchText , buildDataMap() );
        }

        /** update a row object based on a search */
        public void update( String column , String searchText ) throws SQLException
        {
            imp.update( column , searchText , buildDataMap() );
        }

        /** update a row object based on the id */
        public void update( Connection con ) throws SQLException
        {
            imp.update( con , id , buildDataMap() );
        }

        /** update a row object based on the id */
        public void update() throws SQLException
        {
            imp.update( id , buildDataMap() );
        }

        /** create a new row complete with a new ID.

            The current ID is ignored.  The new ID is placed in the row.

            @return the new row ID 
        */
        public long insert( Connection con ) throws SQLException
        {
            return imp.insertAndGetID( con , buildDataMap() );
        }

        /** create a new row complete with a new ID.

            The current ID is ignored.  The new ID is placed in the row.

            @return the new row ID 
        */
        public long insert() throws SQLException
        {
            return imp.insertAndGetID( buildDataMap() );
        }

        /** delete a row object based on the id */
        public void delete( Connection con ) throws SQLException
        {
            imp.delete( con , id );
        }

        /** delete a row object based on the id */
        public void delete() throws SQLException
        {
            imp.delete( id );
        }


    }

    /** Return an empty row object */
    public static Row getRow()
    {
        return imp.getRow();
    }

    /** Instantiate a Row object and fill its content based on a search for the ID. 
     *
     * Return null if not found.
     */
    public static Row getRow( Connection con , int id ) throws SQLException
    {
        return imp.getRow( con , id );
    }

    /** Instantiate a Row object and fill its content based on a search for the ID. 
     *
     * Return null if not found.
     */
    public static Row getRow( long id ) throws SQLException
    {
        return imp.getRow( id );
    }

    /** Instantiate a Row object and fill its content based on a search
     *
     * Return null if not found.
     */
    public static Row getRow( Connection con , String column , String searchText ) throws SQLException
    {
        return imp.getRow( con , column , searchText );
    }

    /** Instantiate a Row object and fill its content based on a search
     *
     * Return null if not found.
     */
    public static Row getRow( String column , String searchText ) throws SQLException
    {
        return imp.getRow( column , searchText );
    }

    /** Return an array of length zero if nothing found */
    public static Row[] getRows( Connection con , String column , String searchText ) throws SQLException
    {
        return imp.getRows( con , column , searchText );
    }

    /** Return an array of length zero if nothing found */
    public static Row[] getRows( String column , String searchText ) throws SQLException
    {
        return imp.getRows( column , searchText );
    }

    /** Return an array of length zero if nothing found */
    public static Row[] getRows( Connection con , String column , String[] searchText ) throws SQLException
    {
        return imp.getRows( con , column , searchText );
    }

    /** Return an array of length zero if nothing found */
    public static Row[] getRows( String column , String[] searchText ) throws SQLException
    {
        return imp.getRows( column , searchText );
    }

    /** Return an array of length zero if nothing found */
    public static Row[] getRows( Connection con , String column , int searchValue ) throws SQLException
    {
        return imp.getRows( con , column , String.valueOf( searchValue ) );
    }

    /** Return an array of length zero if nothing found */
    public static Row[] getRows( String column , int searchValue ) throws SQLException
    {
        return imp.getRows( column , String.valueOf( searchValue ) );
    }

    /** Return an array of length zero if nothing found */
    public static Row[] getRows( Connection con , String column , int[] searchValues ) throws SQLException
    {
        return imp.getRows( con , column , Str.toStringArray( searchValues ) );
    }

    /** Return an array of length zero if nothing found */
    public static Row[] getRows( String column , int[] searchValues ) throws SQLException
    {
        return imp.getRows( column , Str.toStringArray( searchValues ) );
    }

    /** Return an array of length zero if nothing found */
    public static Row[] getRows( Connection con , String whereClause ) throws SQLException
    {
        return imp.getRows( con , whereClause );
    }

    /** Return an array of length zero if nothing found */
    public static Row[] getRows( String whereClause ) throws SQLException
    {
        return imp.getRows( whereClause );
    }

    /** Return an array of length zero if nothing found */
    public static Row[] getAllRows( Connection con ) throws SQLException
    {
        return imp.getAllRows( con );
    }

    /** Return an array of length zero if nothing found */
    public static Row[] getAllRows() throws SQLException
    {
        return imp.getAllRows();
    }

    public static DBResults search( Connection con , String column , String searchText , String[] dataColumns ) throws SQLException
    {
        return imp.search( con , column , searchText , dataColumns );
    }

    public static DBResults search( String column , String searchText , String[] dataColumns ) throws SQLException
    {
        return imp.search( column , searchText , dataColumns );
    }

    public static DBResults search( Connection con , String column , String[] searchText , String[] dataColumns ) throws SQLException
    {
        return imp.search( con , column , searchText , dataColumns );
    }

    public static DBResults search( String column , String searchText[] , String[] dataColumns ) throws SQLException
    {
        return imp.search( column , searchText , dataColumns );
    }

    public static DBResults search( Connection con , String column , int searchValue , String[] dataColumns ) throws SQLException
    {
        return imp.search( con , column , searchValue , dataColumns );
    }

    public static DBResults search( String column , int searchValue , String[] dataColumns ) throws SQLException
    {
        return imp.search( column , searchValue , dataColumns );
    }

    public static DBResults search( Connection con , String column , int[] searchValues , String[] dataColumns ) throws SQLException
    {
        return imp.search( con , column , searchValues , dataColumns );
    }

    public static DBResults search( String column , int[] searchValues , String[] dataColumns ) throws SQLException
    {
        return imp.search( column , searchValues , dataColumns );
    }

    public static DBResults search( Connection con , String whereClause , String[] dataColumns ) throws SQLException
    {
        return imp.search( con , whereClause , dataColumns );
    }

    public static DBResults search( String whereClause , String[] dataColumns ) throws SQLException
    {
        return imp.search( whereClause , dataColumns );
    }

    public static DBResults search( Connection con , String[] dataColumns ) throws SQLException
    {
        return imp.search( con , dataColumns );
    }

    public static DBResults search( String[] dataColumns ) throws SQLException
    {
        return imp.search( dataColumns );
    }

    public static void update( Connection con , String column , String searchText , Map data ) throws SQLException
    {
        imp.update( con , column , searchText , data );
    }

    public static void update( String column , String searchText , Map data ) throws SQLException
    {
        imp.update( column , searchText , data );
    }

    public static void delete( Connection con , long id ) throws SQLException
    {
        imp.delete( con , id );
    }

    public static void delete( long id ) throws SQLException
    {
        imp.delete( id );
    }

    public static void delete( Connection con , String column , String searchText ) throws SQLException
    {
        imp.delete( con , column , searchText );
    }

    public static void delete( String column , String searchText ) throws SQLException
    {
        imp.delete( column , searchText );
    }

    public static long insert( Connection con , Map data ) throws SQLException
    {
        return imp.insertAndGetID( con , data );
    }

    public static long insert( Map data ) throws SQLException
    {
        return imp.insertAndGetID( data );
    }



}
