public class Patient {
    private int id;
    private String name;
    private int birthYear;
    private double height;
    private double weight;
    private String bloodGroup;
    private String phoneNumber;

    public Patient(int id, String name, int birthYear, double height, double weight,String bloodGroup,String phoneNumber) {
        this.id = id;
        this.name = name;
        this.bloodGroup = bloodGroup;
        this.phoneNumber = phoneNumber;

        if (birthYear > 0) {
            this.birthYear = birthYear;
        } else {
            System.out.println("Incorrect birthyear.");
        }

        if (height > 0 && height <= 250) {
            this.height = height;
        } else {
            this.height = height * -1;
            //System.out.println("Incorrect height." );
        }

        if (weight > 0 && weight <= 300) {
            this.weight = weight;
        } else {
            this.weight = weight * -1;
            //System.out.println("Incorrect weight." );
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge(int currentYear) {
        return currentYear - birthYear;
    }
    public String getBloodGroup()
    {
        return bloodGroup;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public double getBMI()
    {
        return weight/(height*height*0.0001);

    }



    public void displayDetails(int currentYear) {
        System.out.println("Patient Name: " + name);
        System.out.println("Patient Age: " + getAge(currentYear));
        System.out.println("Patient Height (cm): " + height);
        System.out.println("Patient Weight (kg): " + weight);
        System.out.println("Patient bloodGroup: " + bloodGroup);
        System.out.println("Patient phoneNumber: " + phoneNumber);
        System.out.println("Patient BMI: " + getBMI());

    }

    public static void main(String[] args) {
        int currentYear = 2024;
        Patient patient = new Patient(1001, "John Doe", 1978, 175.5, 78.0,"O","0123456789");
        patient.displayDetails(currentYear);
        Patient invalidPatient = new Patient(1002, "Joe Dohn", 1990, -160.0, -65.0,"A","0987654321");
        invalidPatient.displayDetails(currentYear);
    }
}



