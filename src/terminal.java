import java.io.*;
class terminal
{
	public static void main(String... args) throws IOException
	{
		
		 ProcessBuilder builder = new ProcessBuilder(
		            "cmd.exe", "/c", "cd \"C:\\nbis_v5_0_0\\Rel_5.0.0\\mindtct\\bin\" && mindtct sample_image.wsq output1");
		        builder.redirectErrorStream(true);
		        Process p = builder.start();
		        BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
		        String line;
		        while (true) {
		            line = r.readLine();
		            if (line == null) { break; }
		            System.out.println(line);
		        }
		        
		        ProcessBuilder builder2 = new ProcessBuilder(
			            "cmd.exe", "/c", "cd \"C:\\nbis_v5_0_0\\Rel_5.0.0\\mindtct\\bin\" &&  mindtct sample_image.wsq output2");
			        builder2.redirectErrorStream(true);
			        Process p2 = builder2.start();
			        BufferedReader r2 = new BufferedReader(new InputStreamReader(p2.getInputStream()));
			        String line2;
			        while (true) {
			            line2 = r2.readLine();
			            if (line == null) { break; }
			            System.out.println(line2);
			        }
			        
			        //C:\\nbis_v5_0_0\\Rel_5.0.0\\mindtct\\bin\\output1.xyt
			        //C:\\nbis_v5_0_0\\Rel_5.0.0\\bozorth3\\bin\\
			         
		
		//-----------------------------------------------------------------
		File f = null;
	      boolean bool = false;
	      
	      try{
	        
	         f = new File("c:/nbis_v5_0_0/Rel_5.0.0/bozorth3/bin/output2.xyt");
	         
	         bool = f.createNewFile();
	        
	         System.out.println("File created: "+bool);
	       
	            
	      }catch(Exception e){
	         e.printStackTrace();
	      }	         
	      
	      //-----------------------------------------------------------
	      f = null;
	      bool = false;
	      
	      try{
	        
	         f = new File("c:/nbis_v5_0_0/Rel_5.0.0/bozorth3/bin/output1.xyt");
	         
	         bool = f.createNewFile();
	        
	         System.out.println("File created: "+bool);
	            
	      }catch(Exception e){
	         e.printStackTrace();
	      }	         
	      
	      //-------------------------------------------------------------
	      
	      File srcFolder = new File("c:\\nbis_v5_0_0\\Rel_5.0.0\\mindtct\\bin\\output1.xyt");
	    	File destFolder = new File("c:\\nbis_v5_0_0\\Rel_5.0.0\\bozorth3\\bin\\output1.xyt");
	    	
	    	if(!srcFolder.exists()){

	           System.out.println("Directory does not exist.");
	           //just exit
	           System.exit(0);

	        }else{

	           try{
	        	copyFolder(srcFolder,destFolder);
	           }catch(IOException e){
	        	e.printStackTrace();
	        	//error, just exit
	                System.exit(0);
	           }
	        }
	    	System.out.println("Done");
	    }
	
	    public static void copyFolder(File src, File dest)
	    	throws IOException{
	    	
	    	if(src.isDirectory()){
	    		
	    		//if directory not exists, create it
	    		if(!dest.exists()){
	    		   dest.mkdir();
	    		   System.out.println("Directory copied from " 
	                              + src + "  to " + dest);
	    		}
	    		
	    		
	    		String files[] = src.list();
	    		
	    		for (String file : files) {
	    		  
	    		   File srcFile = new File(src, file);
	    		   File destFile = new File(dest, file);
	    		  
	    		   copyFolder(srcFile,destFile);
	    		}
	    	   
	    	}else{
	    		
	    		InputStream in = new FileInputStream(src);
	    	        OutputStream out = new FileOutputStream(dest); 
	    	                     
	    	        byte[] buffer = new byte[1024];
	    	    
	    	        int length;
	    	       
	    	        while ((length = in.read(buffer)) > 0){
	    	    	   out.write(buffer, 0, length);
	    	        }
	 
	    	        in.close();
	    	        out.close();
	    	        System.out.println("File copied from " + src + " to " + dest);
	    	}
    	
    	//-------------------------------------------------------------------
	    	 File srcFolder = new File("c:\\nbis_v5_0_0\\Rel_5.0.0\\mindtct\\bin\\output2.xyt");
		    	File destFolder = new File("c:\\nbis_v5_0_0\\Rel_5.0.0\\bozorth3\\bin\\output2.xyt");
	    	
	    	
	    	if(!srcFolder.exists()){

	           System.out.println("Directory does not exist.");
	          
	           System.exit(0);

	        }else{

	           try{
	        	copyFolder2(srcFolder,destFolder);
	           }catch(IOException e){
	        	e.printStackTrace();
	        
	                System.exit(0);
	           }
	        }
	    
	    }
	    
	    public static void copyFolder2(File src, File dest)
	    	throws IOException{
	    	
	    	if(src.isDirectory()){
	    		
	    		if(!dest.exists()){
	    		   dest.mkdir();
	    		   System.out.println("Directory copied from " 
	                              + src + "  to " + dest);
	    		}
	    		
	    		
	    		String files[] = src.list();
	    		
	    		for (String file : files) {
	    		 
	    		   File srcFile = new File(src, file);
	    		   File destFile = new File(dest, file);
	    		   
	    		   copyFolder(srcFile,destFile);
	    		}
	    	   
	    	}else{
	    		
	    		InputStream in = new FileInputStream(src);
	    	        OutputStream out = new FileOutputStream(dest); 
	    	                     
	    	        byte[] buffer = new byte[1024];
	    	    
	    	        int length;
	    	        //copy the file content in bytes 
	    	        while ((length = in.read(buffer)) > 0){
	    	    	   out.write(buffer, 0, length);
	    	        }
	 
	    	        in.close();
	    	        out.close();
	    	        System.out.println("File copied from " + src + " to " + dest);
	    	}
    	
		//-------------------------------------------------------------------	        
			        
			      ProcessBuilder builder3 = new ProcessBuilder(
				            "cmd.exe", "/c", "cd \"C:\\nbis_v5_0_0\\Rel_5.0.0\\bozorth3\\bin\" && bozorth3 output1.xyt output2.xyt");
				        builder3.redirectErrorStream(true);
				        Process p3 = builder3.start();
				        BufferedReader r3 = new BufferedReader(new InputStreamReader(p3.getInputStream()));
				        String line3;
				        while (true) {
				            line3 = r3.readLine();
				            if (line3 == null) { break; }
				            System.out.println(line3);
				        }
           
}       
		
	}