    package Questions.interviewQuestions;

    import java.util.*;
    import java.util.function.Function;
    import java.util.stream.Collector;
    import java.util.stream.Collectors;

    public class A_Demo {
        static class Stud{
            Long id;
            String name;
            String address;
            String phoneNo;

            @Override
            public String toString() {
                return "Stud{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        ", address='" + address + '\'' +
                        ", phoneNo='" + phoneNo + '\'' +
                        '}';
            }

            public Stud() {
            }

            public Stud(Long id, String name, String address, String phoneNo) {
                this.id = id;
                this.name = name;
                this.address = address;
                this.phoneNo = phoneNo;
            }

            public Long getId() {
                return id;
            }

            public void setId(Long id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }

            public String getPhoneNo() {
                return phoneNo;
            }

            public void setPhoneNo(String phoneNo) {
                this.phoneNo = phoneNo;
            }
        }

        public static void main(String[] args) {
            List<Stud> list=  Arrays.asList(
                    new A_Demo.Stud(1L, "Raj", "46 B, Pune", "9325898135"),
                    new A_Demo.Stud(2L, "Yadn", "90 Ram Nagar, Mumbai", "656533"),
                    new A_Demo.Stud(3L, "Saurabh", "12 MG Road, Delhi", "9812345678"),
                    new A_Demo.Stud(4L, "Priya", "77 Green Park, Chennai", "9876543210"),
                    new A_Demo.Stud(5L, "Ankit", "55 Sector 18, Noida", "9123456780"),
                    new A_Demo.Stud(6L, "Neha", "33 Lake View, Kolkata", "7890654321"),
                    new A_Demo.Stud(10L, "Yadn", "90 Ram Nagar, Mumbai", "656533") // duplicate
            );
            DoubleSummaryStatistics collect = list.stream().filter(i -> i.getId() > 5L).collect(Collectors.summarizingDouble(i -> i.getId()));
            System.out.println(collect.getAverage());
            System.out.println(collect.getMax());


        }


    }
