package ikhwan.binar.mydependencyinjection.latihansatu

class Nilai {
    fun convertToString(nilai: Int): String{
        return if (nilai in 85..100){
            "A"
        }else if (nilai in 75..84){
            "B"
        }else if (nilai in 60..74){
            "C"
        }else if(nilai in 50..59){
            "D"
        }else{
            "E"
        }
    }
}