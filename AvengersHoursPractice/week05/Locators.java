package week05;

public class Locators {
    public Locators(String locator) {
    }

    public class locators {
        String locator;

        public void Locators(String locator) {
            this.locator = locator;
        }
    }

    class ID extends Locators {
        public ID(String locator) {
            super(locator);
        }
    }

    class Name extends Locators {
        public Name(String locator) {
            super(locator);
        }
    }

    class TagName extends Locators {
        public TagName(String locator) {
            super(locator);
        }
    }
}

