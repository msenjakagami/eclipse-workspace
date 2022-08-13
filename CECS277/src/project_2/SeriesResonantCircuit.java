package project_2;
/**
 * Subclass of ResonantCircuit. Calculates Resistance, Inductance, and Capacitance based on a Series Resonant 
 * Circuit 
 * @author Gabriel
 *
 */
public class SeriesResonantCircuit extends ResonantCircuit
{
	private double R;
	private double C;
	private double L;
	/**
	 * Overloaded constructor. Calculates Resistance, Inductance, and Capacitance
	 * @param w resonant frequency
	 * @param B bandwidth
	 * @param k gain
	 */
	public SeriesResonantCircuit(double w, double B, double k)
	{
		super(w, B, k);
		 R = 1/k;
		 L = R/B;
		 C = 1/(w * w * L);
	}
	
	/**
	 * Accesor method. Returns the value of the Circuit Resistance
	 * @return R the resistance value of the circuit
	 */
	public double getResistance()
	{
		return R;
	}
	
	/**
	 * Accessor method. Returns the value of the Circuit Capacitance
	 * @return C the capacitance value of the circuit
	 */
	public double getCapacitance()
	{
		return C;
	}
	
	/**
	 * Accessor method. Returns the value of the Circuit Inductance
	 * @return L the inductance value of the circuit
	 */
	public double getInductance()
	{
		return L;
	}
	
	/**
	 * Accessor method. Returns a string with all the values and their units\
	 * @return string ^ that
	 */
	@Override
	public String toString(){
		String string1 = "Resistance: " + R + " Ohms\n";
		String string2 = "Inductance: " + L + " F\n";
		String string3 = "Capacitance: " + C + " H";
		return string1+string2+string3;
	}
}
