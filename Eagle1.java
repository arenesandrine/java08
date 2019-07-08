	package wildcodeschool.java08;
	
	public class Eagle1 extends Bird implements Fly {
		
	    	
	    	
	        private boolean flying1;
	
	        private int altitude1;
	        private String name;
	        
	        public Eagle1(String name) {
	
	            super(name);
	
	            this.flying1 = false;
	
	            this.altitude1 = 0;
	
	        }
	        
	        public String getName() {    // getters et setters
	
	            return this.name;  
	
	        }  
	
	      
	
	        public void setName(String name) {  
	
	            this.name = name;  
	
	        } 
	
	        public int getAltitude1() {
	
	            return this.altitude1;
	
	        }
	        
	        public void setAltitude(int altitude) {
	
	             this.altitude1 = altitude;
	
	        }
	
	
	
	
	        public boolean isFlying1() {
	
	            return flying1;
	
	        }
	        
	        public void setFlying(boolean flying) {
	
	            this.flying1 = flying;
	
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
	        if (!this.flying1 && this.altitude1 == 0) {
	            this.flying1 = true;
	            System.out.printf("%s takeoff into the air.%n", this.getName());
	        }
	    }
	
	    /**
	     * fly ascend
	     * @param meters altitude increase
	     * @return altitude
	     */
	    @Override
	    public int Flyascend(int meters) {
	        if (this.flying1) {
	            this.altitude1 = Math.min(this.altitude1 + meters, 325);
	            System.out.printf("%s fly downward, altitude : %d%n", this.getName(), this.altitude1);
	        }
	        return this.altitude1;
	    }
	
	    /**
	     * fly descend
	     * @param meters altitude decrease
	     * @return altitude
	     */
	    @Override
	    public int Flydescend(int meters) {
	        if (this.flying1) {
	            this.altitude1 = Math.max(this.altitude1 - meters, 0);
	            System.out.printf("%s fly upward, altitude : %d%n", this.getName(), this.altitude1);
	        }
	        return this.altitude1;
	    }
	
	    /**
	     * get out of sky, must be on water
	     */
	    @Override
	    public void land() {
	        if (this.flying1 && this.altitude1 == 0) {
	            System.out.printf("%s gets out of the air.%n", this.getName());
	        } else {
	            System.out.printf("%s is too deep, it can't get out.%n", this.getName());
	        }
	    }
	
		@Override
		public int ascend(int meters) {
			// TODO Auto-generated method stub
			return 0;
		}
	
		@Override
		public int descend(int meters) {
			// TODO Auto-generated method stub
			return 0;
		}
	
	}