package com.edvantis.ysem.standalone;

public class Main
{
	public static void main(String... anArgs) throws Exception
    {
        new Main().start();
    }

	private WebServer server;
    
    public Main()
    {
    	System.setProperty("org.apache.jasper.compiler.disablejsr199", "true");
        server = new WebServer(8000);        
    }
    
    public void start() throws Exception
    {
        server.start();        
        server.join();
    }
}