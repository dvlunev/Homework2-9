package transport;

public enum BodyType {
        SEDAN("Седан"),
        HATCHBACK("Хэтчбэк"),
        COUPE("Купе"),
        WAGON("Универсал"),
        SUV("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн");

        private final String bodyType;

    BodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getBodyType() {
        return bodyType;
    }

    public static BodyType findByBodyTypeName(String bodyType) {
        for (BodyType bodyTypeName : values()) {
            if (bodyTypeName.getBodyType().equals(bodyType)) {
                return bodyTypeName;
            }
        }
        return null;
    }
}
