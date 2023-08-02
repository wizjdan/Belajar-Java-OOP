public class PersonApp {
    public static void main(String[] args) {
        //Berikut adalah contoh bagaimana membuat object
        /*
        Menggunakan kata kunci new kemudian diikuti dengan nama dari class nya.
         */
        var person1 = new Person("Pangestu", "Bogor");// contoh 1
        person1.nama = "Pangestu Nugraha";
        person1.alamat = "Bogor";
        /*person1.kewarganegaraan = "Indonesia";*/ // Valuenya tidak bisa dirubah karena menggunakan kata kunci final

        /*
         Untuk mengakses field dari class nya. Cukup menggunakan titik kemudian diikuti dengan nama fieldnya.
         */
        System.out.println(person1.nama);
        System.out.println(person1.alamat);
        System.out.println(person1.kewarganegaraan);
        person1.sayHello("Ria");

        Person person2 = new Person("Shiro", "Bogor"); // contoh 2
        person2.nama = "Shiro";
        person2.alamat = "Bogor";

        System.out.println(person2.nama);
        System.out.println(person2.alamat);
        System.out.println(person2.kewarganegaraan);
        person2.sayHello("Ria");

        Person person3; // contoh 3
        person3 = new Person("Cireng", "Bogor");
        person3.nama = "Cireng";
        person3.alamat = "Bogor";

        System.out.println(person3.nama);
        System.out.println(person3.alamat);
        System.out.println(person3.kewarganegaraan);
        person3.sayHello("Ria");




    }
}
