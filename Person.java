class Person {
    String nama;
    String alamat;
    String kewarganegaraan = "Indonesia";

    /*
    Ini adalah contoh pembuatan constractor.
    Constractor adalah method yang akan di panggil ketika pertama kali object dibuat.
     */
    Person(String parameterNama, String parameterAlamat){
        nama = parameterNama;
        alamat = parameterAlamat;
    }

    //Void tidak membalikan data apapun
    /*
    Contoh Method di dalam class
     */
    void sayHello(String parameterNama){
        System.out.println("Halo " + parameterNama + ", Nama saya " + nama);
    }
}
