package first_java_network;

import java.util.ArrayList;

import activtion_functions.IActivationFunction;

public abstract class NeuralLayer {
	protected int numOfNIL; //number of Neurons In Layer
	protected IActivationFunction actFunc; //The Activation Function
	protected NeuralLayer prvLayer;
	protected NeuralLayer nextLayer; 
	protected ArrayList<Double> input;
	protected ArrayList<Double> output;
	protected int numOfInputs;
	
	private ArrayList<Double> neuron;
	
}
