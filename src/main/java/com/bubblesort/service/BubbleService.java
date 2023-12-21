package com.bubblesort.service;



import com.bubblesort.contract.response.BubbleResponse;
import org.springframework.stereotype.Service;

@Service
public class BubbleService {
    public BubbleResponse bubbleSort(int[] numbers){
        long startTime = System.nanoTime();
        int n = numbers.length;
        boolean swapped;
        do{
            swapped=false;
            for(int i = 1; i < n ;i++){
                if( numbers[i-1] > numbers[i] ){
                    int temp=numbers[i-1];
                    numbers[i-1]=numbers[i];
                    numbers[i]=temp;
                    swapped=true;
                }
            }
        }
        while (swapped);
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        return new BubbleResponse(numbers,elapsedTime);
    }
}
