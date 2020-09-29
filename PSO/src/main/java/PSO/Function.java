package PSO;

class Function {
    /**
     * Calculate the result of 2^(-2 * ((x-0.1)/0.9)^2)*(sin(5 * PI * x))^6.
     * Domain is (-2, 2).
     * Maximum is 1 at x=0.09876845112013721.
     * @param x     the x component
     * @return      the y component
     */
    static double functionA (double x) {
//        return Math.round(Math.pow(2, -2 * Math.pow((x - 0.1) / 0.9,2)) * Math.pow(Math.sin(5 * Math.PI * x),6) * 100)/100d;
        return Math.pow(2, -2 * Math.pow((x - 0.1) / 0.9,2)) * Math.pow(Math.sin(5 * Math.PI * x),6);
    }
}