	package wildcodeschool.java08;
	
	public class Eagle extends Bird implements Fly {
		
	    	
	    	
	        private boolean flying;
	
	        private int altitude;
	       // private String name;
	        
	        public Eagle(String name) {
	
	            super(name);
	
	            this.flying = false;
	
	            this.altitude = 0;
	
	        }
	        
	        /*public String getName() {    // getters et setters
	
	          *  return this.name;  
	
	        }  
	
	      
	
	        public void setName(String name) {  
	
	            this.name = name;  
	
	        } 
	        */
	
	        public int getAltitude() {
	
	            return this.altitude;
	
	        }
	        
	        public void setAltitude(int altitude) {
	
	             this.altitude = altitude;
	
	        }
	
	
	
	
	        public boolean isFlying() {
	
	            return flying;
	
	        }
	        
	        public void setFlying(boolean flying) {
	
	            this.flying = flying;
	
	        }
		
	
	
	
	    @Override
	
	    public String sing() {
	
	        return "Screech!";
	
	    }
	    @Override
		
	    public void glide() {
	
	        System.out.printf("It glides into the air.");
	    }
	
	
	    /**
	     * 
	     */
	    @Override
	    public void takeOff() {
	        if (!this.flying && this.altitude == 0) {
	            this.flying = true;
	            System.out.printf("%s  takeoff into the sky.%n", this.getName());
	        }
	    }
	
	    /**
	     * fly ascend
	     * @param meters altitude increase
	     * @return altitude
	     */
	    @Override
	    public int ascend(int meters) {
	        if (this.flying) {
	            this.altitude = Math.min(this.altitude + meters, 3200);
	            System.out.printf("%s flies upware, altitude : %d%n", this.getName(), this.altitude);
	        }
	        return this.altitude;
	    }
	
	   
	
	    /**
	     * get out of sky, must be on water
	     */
	    @Override
	    public void land() {
	        if (this.flying && this.altitude == 0) {
	            System.out.printf("%s gets out of the air.%n", this.getName());
	        } else {
	            System.out.printf("%s is too high, it can't get out.%n", this.getName());
	        }
	    }
	

	
	    /**
	     * fly descend
	     * @param meters altitude decrease
	     * @return altitude
	     */
	    @Override
	    public int descend(int meters) {
	        if (this.flying) {
	            this.altitude = Math.max(this.altitude - meters, 0);
	            System.out.printf("%s flies downward, altitude : %d%n", this.getName(), this.altitude);
	        }
	        return this.altitude;
	    }

		
	
	}