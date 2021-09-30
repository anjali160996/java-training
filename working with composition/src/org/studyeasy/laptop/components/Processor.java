package org.studyeasy.laptop.components;

public class Processor {
private String brand;
private String series;
private int generation;
private int cores;
private int threads;
private String cacheMemory;
private String freq;
private String minfreq;
private String maxfreq;

public Processor() {
	this.brand = "intel";
	this.series = "i5 7200u";
	this.generation = 7;
	this.cores = 2;
	this.threads = 4;
	this.cacheMemory = "3MB";
	this.freq = "2.5GHz";
	this.minfreq ="2.5GHz";
	this.maxfreq = "3.1GHz";
	
}

public Processor(String brand, String series, int generation, int cores, int threads, String cacheMemory, String freq, String minfreq,
		String maxfreq) {
	super();
	this.brand = brand;
	this.series = series;
	this.generation = generation;
	this.cores = cores;
	this.threads = threads;
	this.cacheMemory = cacheMemory;
	this.freq = freq;
	this.minfreq = minfreq;
	this.maxfreq = maxfreq;
}

@Override
public String toString() {
	return "Processor [brand=" + brand + ", series=" + series + ", generation=" + generation + ", cores=" + cores
			+ ", threads=" + threads + ", cacheMemory=" + cacheMemory + ", freq=" + freq + ", minfreq=" + minfreq
			+ ", maxfreq=" + maxfreq + "]";
}

public String getBrand() {
	return brand;
}

public String getSeries() {
	return series;
}

public int getGeneration() {
	return generation;
}

public int getCores() {
	return cores;
}

public int getThreads() {
	return threads;
}

public String getCacheMemory() {
	return cacheMemory;
}

public String getFreq() {
	return freq;
}

public String getMinfreq() {
	return minfreq;
}

public String getMaxfreq() {
	return maxfreq;
}

public void setFreq(String freq) {
	this.freq = freq;
}



}
