public final class ImmutableString {
    private final String value;

    public ImmutableString(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    // No setter methods

    public ImmutableString concat(ImmutableString other) {
        return new ImmutableString(this.value + other.getValue());
    }

    public int length() {
        return value.length();
    }

    public char charAt(int index) {
        return value.charAt(index);
    }

    public ImmutableString substring(int beginIndex, int endIndex) {
        return new ImmutableString(value.substring(beginIndex, endIndex));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImmutableString other = (ImmutableString) obj;
        return value.equals(other.getValue());
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public String toString() {
        return value;
    }
}
