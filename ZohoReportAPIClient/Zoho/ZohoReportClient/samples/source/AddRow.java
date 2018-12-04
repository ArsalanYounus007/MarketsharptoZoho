
/**
 *@(#)AddRow.java
 *Copyright (c) 2008  AdventNet, Inc. All Rights Reserved.
 *$Id$
 */

package Zoho.ZohoReportClient.samples.source;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Properties;

import java.util.Map;

import java.util.Iterator;

import com.adventnet.zoho.client.report.*;
import java.util.Date;

/**
 * The sample code for adding a row to a table. 
 *
 * In this example a row is added to the table "Sales".
 *
 * See SAMPLES_README.html
 *
 */

public class AddRow 
{
    private ReportClient rc = Config.getReportClient();

    public static void addRow(String ID,String Data) throws Exception
    {
        String uri = rc.getURI(Config.LOGINEMAILID,Config.DATABASENAME,"Sales");
        Map result = rc.addRow(uri,getRowValues(ID,Data),null);
        System.out.println("Successfully added the row to " + uri);
        System.out.println(" The response is " + result);
    }

    private static HashMap getRowValues(String ID,String Data)
    {
        SimpleDateFormat dtFmt = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        HashMap rowValsMap = new HashMap();
        //rowValsMap.put("Date",dtFmt.format(new Date()));
        rowValsMap.put(ID,Data);
        //rowValsMap.put("Product Category","Sample_Grocery");
        //rowValsMap.put("Product","Sample_Meat");
        //rowValsMap.put("Customer Name","John");
        //rowValsMap.put("Sales","2303");
        //rowValsMap.put("Cost","1000");
        return rowValsMap;
    }
    public static void main(String[] args)
        throws Exception
    {
        AddRow row = new AddRow();

        //call ADDROW API with the same logged in session
        row.addRow("ID","24");
        //row.addRow();

    }


}
