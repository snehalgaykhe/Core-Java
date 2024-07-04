package com.tnsif.daytwenty;
	
	@SmartTV(os= "Android", price=50000)
public class AdroidSeries {

		String model;
		int ScreenSize;
		
		
		public AdroidSeries(String model, int screenSize) {
			this.model = model;
			ScreenSize = screenSize;
		}


		@Override
		public String toString() {
			return "AdroidSeries [model=" + model + ", ScreenSize=" + ScreenSize + "]";
		}
		
}
