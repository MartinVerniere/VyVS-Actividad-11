class Actividad11 {

    fun listSize(l: List<Char>) = l.size

    fun countElemsList(l: List<Char>, e:Char): Int {
        var count = 0
        for(c in l)
            if (c == e) count++
        return count
    }

    fun firstLastElemsEqual(l: List<Char>): Boolean {
        return if (l.isEmpty())
            false
        else l[0] == l[l.size - 1]
    }
}