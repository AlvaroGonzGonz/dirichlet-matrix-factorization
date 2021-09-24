# GridSearch results

## MovieLens 1M dataset

### BeMF

```
Tuning parameters for BeMF recommender:

Best parameters set found on development set:

{numIters=100, seed=43, ratings=[1.0, 2.0, 3.0, 4.0, 5.0], learningRate=0.006, regularization=0.16, numFactors=2}

MAE scores on development set:

0.736607 for {numIters=100, seed=43, ratings=[1.0, 2.0, 3.0, 4.0, 5.0], learningRate=0.006, regularization=0.16, numFactors=2}
0.737036 for {numIters=75, seed=43, ratings=[1.0, 2.0, 3.0, 4.0, 5.0], learningRate=0.006, regularization=0.15000000000000002, numFactors=2}
0.737121 for {numIters=100, seed=43, ratings=[1.0, 2.0, 3.0, 4.0, 5.0], learningRate=0.006, regularization=0.060000000000000005, numFactors=2}
0.737209 for {numIters=100, seed=43, ratings=[1.0, 2.0, 3.0, 4.0, 5.0], learningRate=0.006, regularization=0.11, numFactors=2}
0.737290 for {numIters=75, seed=43, ratings=[1.0, 2.0, 3.0, 4.0, 5.0], learningRate=0.006, regularization=0.04, numFactors=2}
0.737314 for {numIters=100, seed=43, ratings=[1.0, 2.0, 3.0, 4.0, 5.0], learningRate=0.006, regularization=0.12, numFactors=2}
0.737368 for {numIters=75, seed=43, ratings=[1.0, 2.0, 3.0, 4.0, 5.0], learningRate=0.006, regularization=0.14, numFactors=2}
0.737379 for {numIters=75, seed=43, ratings=[1.0, 2.0, 3.0, 4.0, 5.0], learningRate=0.006, regularization=0.060000000000000005, numFactors=2}
0.737396 for {numIters=100, seed=43, ratings=[1.0, 2.0, 3.0, 4.0, 5.0], learningRate=0.006, regularization=0.03, numFactors=2}
0.737420 for {numIters=75, seed=43, ratings=[1.0, 2.0, 3.0, 4.0, 5.0], learningRate=0.006, regularization=0.19, numFactors=2}
0.737464 for {numIters=100, seed=43, ratings=[1.0, 2.0, 3.0, 4.0, 5.0], learningRate=0.006, regularization=0.19, numFactors=2}
0.737478 for {numIters=75, seed=43, ratings=[1.0, 2.0, 3.0, 4.0, 5.0], learningRate=0.006, regularization=0.13, numFactors=2}
0.737507 for {numIters=75, seed=43, ratings=[1.0, 2.0, 3.0, 4.0, 5.0], learningRate=0.006, regularization=0.09, numFactors=2}
0.737570 for {numIters=75, seed=43, ratings=[1.0, 2.0, 3.0, 4.0, 5.0], learningRate=0.006, regularization=0.06999999999999999, numFactors=2}
0.737572 for {numIters=100, seed=43, ratings=[1.0, 2.0, 3.0, 4.0, 5.0], learningRate=0.006, regularization=0.2, numFactors=2}
0.737616 for {numIters=75, seed=43, ratings=[1.0, 2.0, 3.0, 4.0, 5.0], learningRate=0.006, regularization=0.08, numFactors=2}
0.737735 for {numIters=75, seed=43, ratings=[1.0, 2.0, 3.0, 4.0, 5.0], learningRate=0.006, regularization=0.17, numFactors=2}
0.737747 for {numIters=75, seed=43, ratings=[1.0, 2.0, 3.0, 4.0, 5.0], learningRate=0.006, regularization=0.18000000000000002, numFactors=2}
0.737757 for {numIters=100, seed=43, ratings=[1.0, 2.0, 3.0, 4.0, 5.0], learningRate=0.006, regularization=0.02, numFactors=2}
0.737762 for {numIters=75, seed=43, ratings=[1.0, 2.0, 3.0, 4.0, 5.0], learningRate=0.006, regularization=0.12, numFactors=2}
0.737766 for {numIters=100, seed=43, ratings=[1.0, 2.0, 3.0, 4.0, 5.0], learningRate=0.006, regularization=0.06999999999999999, numFactors=2}
0.737793 for {numIters=100, seed=43, ratings=[1.0, 2.0, 3.0, 4.0, 5.0], learningRate=0.006, regularization=0.01, numFactors=2}
0.737795 for {numIters=75, seed=43, ratings=[1.0, 2.0, 3.0, 4.0, 5.0], learningRate=0.006, regularization=0.2, numFactors=2}
0.737813 for {numIters=75, seed=43, ratings=[1.0, 2.0, 3.0, 4.0, 5.0], learningRate=0.006, regularization=0.16, numFactors=2}
0.737836 for {numIters=75, seed=43, ratings=[1.0, 2.0, 3.0, 4.0, 5.0], learningRate=0.006, regularization=0.03, numFactors=2}
```

### PMF

```
Best parameters set found on development set:

{numIters=50, lambda=0.045, seed=43, gamma=0.01, numFactors=8}

MAE scores on development set:

0.718681 for {numIters=50, lambda=0.045, seed=43, gamma=0.01, numFactors=8}
0.718801 for {numIters=50, lambda=0.04, seed=43, gamma=0.01, numFactors=8}
0.718810 for {numIters=50, lambda=0.049999999999999996, seed=43, gamma=0.01, numFactors=8}
0.719177 for {numIters=50, lambda=0.055, seed=43, gamma=0.01, numFactors=8}
0.719208 for {numIters=50, lambda=0.034999999999999996, seed=43, gamma=0.01, numFactors=8}
0.719788 for {numIters=50, lambda=0.06, seed=43, gamma=0.01, numFactors=8}
0.719954 for {numIters=50, lambda=0.030000000000000002, seed=43, gamma=0.01, numFactors=8}
0.720601 for {numIters=50, lambda=0.04, seed=43, gamma=0.01, numFactors=6}
0.720628 for {numIters=50, lambda=0.034999999999999996, seed=43, gamma=0.01, numFactors=6}
0.720635 for {numIters=50, lambda=0.065, seed=43, gamma=0.01, numFactors=8}
```

## FilmTrust dataset

### BeMF

```
Best parameters set found on development set:

{numIters=100, seed=43, ratings=[0.5, 1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0], learningRate=0.012, regularization=0.14, numFactors=2}

MAE scores on development set:

0.778503 for {numIters=100, seed=43, ratings=[0.5, 1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0], learningRate=0.012, regularization=0.14, numFactors=2}
0.778859 for {numIters=100, seed=43, ratings=[0.5, 1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0], learningRate=0.008, regularization=0.19, numFactors=2}
0.778921 for {numIters=50, seed=43, ratings=[0.5, 1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0], learningRate=0.012, regularization=0.16, numFactors=2}
0.779273 for {numIters=100, seed=43, ratings=[0.5, 1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0], learningRate=0.008, regularization=0.14, numFactors=2}
0.779489 for {numIters=100, seed=43, ratings=[0.5, 1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0], learningRate=0.008, regularization=0.13, numFactors=2}
0.779711 for {numIters=100, seed=43, ratings=[0.5, 1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0], learningRate=0.008, regularization=0.09, numFactors=2}
0.779744 for {numIters=100, seed=43, ratings=[0.5, 1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0], learningRate=0.008, regularization=0.02, numFactors=2}
0.779803 for {numIters=100, seed=43, ratings=[0.5, 1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0], learningRate=0.008, regularization=0.2, numFactors=2}
0.779917 for {numIters=100, seed=43, ratings=[0.5, 1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0], learningRate=0.008, regularization=0.09999999999999999, numFactors=2}
0.780025 for {numIters=100, seed=43, ratings=[0.5, 1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0], learningRate=0.008, regularization=0.16, numFactors=2}
0.780119 for {numIters=100, seed=43, ratings=[0.5, 1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0], learningRate=0.008, regularization=0.17, numFactors=2}
0.780182 for {numIters=100, seed=43, ratings=[0.5, 1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0], learningRate=0.008, regularization=0.12, numFactors=2}
0.780196 for {numIters=50, seed=43, ratings=[0.5, 1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0], learningRate=0.012, regularization=0.19, numFactors=2}
0.780205 for {numIters=100, seed=43, ratings=[0.5, 1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0], learningRate=0.012, regularization=0.02, numFactors=2}
0.780462 for {numIters=100, seed=43, ratings=[0.5, 1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0], learningRate=0.008, regularization=0.08, numFactors=2}
0.780479 for {numIters=100, seed=43, ratings=[0.5, 1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0], learningRate=0.008, regularization=0.11, numFactors=2}
0.780563 for {numIters=100, seed=43, ratings=[0.5, 1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0], learningRate=0.012, regularization=0.16, numFactors=2}
0.780623 for {numIters=50, seed=43, ratings=[0.5, 1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0], learningRate=0.008, regularization=0.19, numFactors=2}
0.780632 for {numIters=100, seed=43, ratings=[0.5, 1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0], learningRate=0.008, regularization=0.05, numFactors=2}
0.780844 for {numIters=100, seed=43, ratings=[0.5, 1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0], learningRate=0.008, regularization=0.03, numFactors=2}
0.780844 for {numIters=50, seed=43, ratings=[0.5, 1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0], learningRate=0.008, regularization=0.02, numFactors=2}
0.780899 for {numIters=50, seed=43, ratings=[0.5, 1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0], learningRate=0.008, regularization=0.18000000000000002, numFactors=2}
0.781145 for {numIters=50, seed=43, ratings=[0.5, 1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0], learningRate=0.008, regularization=0.08, numFactors=2}
0.781171 for {numIters=50, seed=43, ratings=[0.5, 1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0], learningRate=0.008, regularization=0.03, numFactors=2}
0.781186 for {numIters=50, seed=43, ratings=[0.5, 1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0], learningRate=0.008, regularization=0.17, numFactors=2}
```

### PMF

```
Best parameters set found on development set:

{numIters=50, lambda=0.1, seed=43, gamma=0.015, numFactors=4}

MAE scores on development set:

0.846590 for {numIters=50, lambda=0.1, seed=43, gamma=0.015, numFactors=4}
0.846833 for {numIters=50, lambda=0.095, seed=43, gamma=0.015, numFactors=4}
0.847251 for {numIters=50, lambda=0.09000000000000001, seed=43, gamma=0.015, numFactors=4}
0.847326 for {numIters=50, lambda=0.005, seed=43, gamma=0.015, numFactors=2}
0.847882 for {numIters=50, lambda=0.01, seed=43, gamma=0.015, numFactors=2}
0.847973 for {numIters=50, lambda=0.085, seed=43, gamma=0.015, numFactors=4}
0.848154 for {numIters=50, lambda=0.015, seed=43, gamma=0.02, numFactors=2}
0.848223 for {numIters=50, lambda=0.02, seed=43, gamma=0.02, numFactors=2}
0.848327 for {numIters=50, lambda=0.01, seed=43, gamma=0.02, numFactors=2}
0.848343 for {numIters=50, lambda=0.015, seed=43, gamma=0.015, numFactors=2}
```
## MyAnimeList

### BeMF

```
Best parameters set found on development set:

{numIters=100, seed=43, ratings=[1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0], learningRate=0.004, regularization=0.09999999999999999, numFactors=4}

MAE scores on development set:

0.986767 for {numIters=100, seed=43, ratings=[1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0], learningRate=0.004, regularization=0.09999999999999999, numFactors=4}
0.986879 for {numIters=100, seed=43, ratings=[1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0], learningRate=0.004, regularization=0.18000000000000002, numFactors=4}
0.989344 for {numIters=100, seed=43, ratings=[1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0], learningRate=0.004, regularization=0.19, numFactors=4}
0.989755 for {numIters=100, seed=43, ratings=[1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0], learningRate=0.004, regularization=0.2, numFactors=4}
0.990111 for {numIters=100, seed=43, ratings=[1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0], learningRate=0.004, regularization=0.05, numFactors=4}
0.990156 for {numIters=75, seed=43, ratings=[1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0], learningRate=0.004, regularization=0.15000000000000002, numFactors=4}
0.990701 for {numIters=100, seed=43, ratings=[1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0], learningRate=0.004, regularization=0.06999999999999999, numFactors=4}
0.990917 for {numIters=100, seed=43, ratings=[1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0], learningRate=0.004, regularization=0.01, numFactors=4}
0.991909 for {numIters=100, seed=43, ratings=[1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0], learningRate=0.004, regularization=0.16, numFactors=4}
0.992160 for {numIters=100, seed=43, ratings=[1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0], learningRate=0.004, regularization=0.060000000000000005, numFactors=4}
0.992406 for {numIters=100, seed=43, ratings=[1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0], learningRate=0.004, regularization=0.14, numFactors=4}
0.992735 for {numIters=75, seed=43, ratings=[1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0], learningRate=0.004, regularization=0.09, numFactors=4}
0.992789 for {numIters=100, seed=43, ratings=[1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0], learningRate=0.004, regularization=0.12, numFactors=4}
0.993049 for {numIters=100, seed=43, ratings=[1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0], learningRate=0.004, regularization=0.17, numFactors=4}
0.993435 for {numIters=100, seed=43, ratings=[1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0], learningRate=0.004, regularization=0.15000000000000002, numFactors=4}
0.993699 for {numIters=100, seed=43, ratings=[1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0], learningRate=0.004, regularization=0.02, numFactors=4}
0.994662 for {numIters=100, seed=43, ratings=[1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0], learningRate=0.004, regularization=0.11, numFactors=4}
0.994794 for {numIters=100, seed=43, ratings=[1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0], learningRate=0.004, regularization=0.03, numFactors=4}
0.995190 for {numIters=75, seed=43, ratings=[1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0], learningRate=0.004, regularization=0.03, numFactors=4}
0.995226 for {numIters=100, seed=43, ratings=[1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0], learningRate=0.004, regularization=0.08, numFactors=4}
0.995760 for {numIters=75, seed=43, ratings=[1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0], learningRate=0.004, regularization=0.13, numFactors=4}
0.995905 for {numIters=75, seed=43, ratings=[1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0], learningRate=0.004, regularization=0.11, numFactors=4}
0.996425 for {numIters=100, seed=43, ratings=[1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0], learningRate=0.004, regularization=0.09, numFactors=4}
0.996527 for {numIters=75, seed=43, ratings=[1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0], learningRate=0.004, regularization=0.14, numFactors=4}
0.996545 for {numIters=75, seed=43, ratings=[1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0], learningRate=0.004, regularization=0.060000000000000005, numFactors=4}
```


### PMF

```
Best parameters set found on development set:

{numIters=50, lambda=0.085, seed=43, gamma=0.005, numFactors=10}

MAE scores on development set:

1.100057 for {numIters=50, lambda=0.085, seed=43, gamma=0.005, numFactors=10}
1.100132 for {numIters=50, lambda=0.09000000000000001, seed=43, gamma=0.005, numFactors=10}
1.100141 for {numIters=50, lambda=0.08, seed=43, gamma=0.005, numFactors=10}
1.100348 for {numIters=50, lambda=0.095, seed=43, gamma=0.005, numFactors=10}
1.100388 for {numIters=50, lambda=0.07500000000000001, seed=43, gamma=0.005, numFactors=10}
1.100703 for {numIters=50, lambda=0.1, seed=43, gamma=0.005, numFactors=10}
1.100796 for {numIters=50, lambda=0.07, seed=43, gamma=0.005, numFactors=10}
1.101299 for {numIters=50, lambda=0.034999999999999996, seed=43, gamma=0.005, numFactors=4}
1.101319 for {numIters=50, lambda=0.04, seed=43, gamma=0.005, numFactors=4}
1.101346 for {numIters=50, lambda=0.030000000000000002, seed=43, gamma=0.005, numFactors=4}
```