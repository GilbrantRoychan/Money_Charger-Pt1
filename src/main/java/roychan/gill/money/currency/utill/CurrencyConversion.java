package roychan.gill.money.currency.utill;

public class CurrencyConversion {
        private static final double USD_TO_IDR = 15000.0;
        private static final double JPY_TO_IDR = 105.0;
        private static final double USD_TO_JPY = 142.85;

        // --- Konversi dari Rupiah (IDR) ---
        public static long idrToUsd(long amountInIDR) {
            if (amountInIDR <= 0) return 0L;
            return (long) ((double) amountInIDR / USD_TO_IDR * 100);
        }

        public static long idrToIdr(long amountInIDR) {
            if (amountInIDR <= 0) return 0L;
            return amountInIDR;
        }

        public static long idrToJpy(long amountInIDR) {
            if (amountInIDR <= 0) return 0L;
            return (long) ((double) amountInIDR / JPY_TO_IDR);
        }

        // --- Konversi dari Dolar AS (USD) ---
        public static long usdToIdr(long amountInUSD) {
            if (amountInUSD <= 0) return 0L;
            return (long) ((double) amountInUSD / 100 * USD_TO_IDR);
        }

        public static long usdToJpy(long amountInUSD) {
            if (amountInUSD <= 0) return 0L;
            return (long) ((double) amountInUSD / 100 * USD_TO_JPY);
        }

        public static long usdToUsd(long amountInUSD) {
            if (amountInUSD <= 0) return 0L;
            return amountInUSD;
        }

        // --- Konversi dari Yen Jepang (JPY) ---
        public static long jpyToIdr(long amountInJPY) {
            if (amountInJPY <= 0) return 0L;
            return (long) ((double) amountInJPY * JPY_TO_IDR);
        }

        public static long jpyToUsd(long amountInJPY) {
            if (amountInJPY <= 0) return 0L;
            return (long) ((double) amountInJPY / USD_TO_JPY * 100);
        }

        public static long jpyToJpy(long amountInJPY) {
            if (amountInJPY <= 0) return 0L;
            return amountInJPY;
        }
    }

