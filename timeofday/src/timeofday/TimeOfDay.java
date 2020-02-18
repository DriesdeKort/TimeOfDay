package timeofday;

import timeofday.TimeOfDayTest.TimeOfDay;

public class TimeOfDay {
	
	private int minutesSinceMidnight;
	
	int getHours() {
		return minutesSinceMidnight/60;
		}
	int getMinutes() {
		return minutesSinceMidnight% 60;
		}
	/**
	 * Sets this object's hours.
	 * 
	 * @pre The given hours are between 0 and 23
	 * 		| 0 <= hours & hours <= 23
	 * @post This object's hours equal the given hours
	 * 		| getHours() == hours
	 * @post this object's minutes have remained untouched
	 * 		| getMinutes() == old(getMinutes())
	 */
	
	/* void setHours(TimeOfDay t, int hours) {t.hours = hours;} */
	void setHours(int hours) {
		minutesSinceMidnight = getMinutes() + hours*60;
		}
	
	/**
	 * sSets this object's minutes.
	 * 
	 * @pre The given hours are between 0 and 59
	 * 		| 0 <= minutes && minutes <= 59
	 * @post This object's hours equal the given hours
	 * 		| getMinutes() == minutes
	 * @post this object's minutes have remained untouched
	 * 		| getHours() == old(getHours())
	 */
	
	
	void setMinutes( int minutes) {
		minutesSinceMidnight = getHours()*60 + minutes;
		}


}
