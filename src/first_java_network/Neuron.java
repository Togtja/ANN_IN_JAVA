package first_java_network;

import java.util.ArrayList;

import activtion_functions.IActivationFunction;
import math.RandomNumbers;

public class Neuron {
	/*
	 * Inputs
	 * Weights 
	 * Bias
	 * Activation Function
	 * Output
	 * 
	 */
	protected ArrayList<Double> weight;
	protected Double bias = 1.0;
	
	private ArrayList<Double> input;
	private Double output;
	private Double outputBeforeActivation;
	private int numberOfInputs = 0;
	private IActivationFunction activationFunction;
	
	public Neuron(int NOI,IActivationFunction AF) {
		numberOfInputs = NOI;
		activationFunction = AF;
		weight = new ArrayList<>(numberOfInputs + 1);
		input = new ArrayList<>(numberOfInputs);
	}
	public void init() {
		for(int i = 0; i <= numberOfInputs; i++) {
			double newWeight = RandomNumbers.GenerateNext();
			try {
				weight.set(i, newWeight);
			}
			catch(IndexOutOfBoundsException iobe) {
				weight.add(newWeight);
			}
		}
	}
	public void calc() {
		outputBeforeActivation = 0.0;
		if(input != null && weight != null) {
			for(int i = 0; i < numberOfInputs; i++) {
				outputBeforeActivation += input.get(i)*weight.get(i);

			}
			outputBeforeActivation += bias * weight.get(numberOfInputs);
		}
		output = activationFunction.calc(outputBeforeActivation);
	}
}
