package project_2;
/**
 * Object that represents a ResonantCircuit and provides methods to set and return the values of the circuit
 * @author Gabriel
 *
 */
public class ResonantCircuit 
{
	private double w;
	private double B;
	private double k;
	/**
	 * Default constructor. Sets values to 0
	 */
	public ResonantCircuit()
	{
		w = 0;
		B = 0;
		k = 0;
	}
	
	/**
	 * Overloaded constructor. Sets circuit values to entered values
	 * @param w resonant frequency
	 * @param B bandwidth
	 * @param k gain
	 */
	public ResonantCircuit(double w, double B, double k)
	{
		this.w = w;
		this.B = B;
		this.k = k;
	}
	/**
	 * Mutator method. sets resonant frequency value
	 * @param resonant value to set resonant frequency to
	 */
	public void setResonantFrequency(double resonant)
	{
		w = resonant;
	}
	/**
	 * Mutator method. Sets bandwidth value
	 * @param bandwidth value to set bandwidth to
	 */
	public void setBandwidth(double bandwidth)
	{
		B = bandwidth;
	}
	/**
	 * Mutator method. Sets gain value
	 * @param frequency value to set frequency to
	 */
	public void setFrequency(double frequency)
	{
		k = frequency;
	}
	/**
	 * Accessor method. Returns REsonant frequency value
	 * @return resonant frequency
	 */
	public double getResonantFrequency()
	{
		return w;
	}
	/**
	 * Accessor method. Returns bandwidth value
	 * @return bandwidth
	 */
	public double getBandwidth()
	{
		return B;
	}
	/**
	 * Accessor method. Returns gain value
	 * @return gain
	 */
	public double getFrequency()
	{
		return k;
	}
	/**
	 * Accessor method. REturns a string with all the values and their units
	 * @return string ^ that
	 */
	public String toString(){
		String string1 = "Resonant Frequency: " + w + " Hz\n";
		String string2 = "Bandwidth: " + B +  "Hz\n";
		String string3 = "Gain: " + k + " dB";
		return string1+string2+string3;
		
	}
}
