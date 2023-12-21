package com.bubblesort.contract.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Data
public class BubbleResponse {
    private int[] sortedNumbers;
    private long elapsedTime;
}
