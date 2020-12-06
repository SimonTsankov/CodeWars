import itertools
class RomanNumerals:
    def to_roman(n):
        L = "".join(list(itertools.repeat("I",n)))#for each number we put one I

        # every 5 "I" are one "V", 4 are "IV" VV == "X" and so on. So we group them until we have our Roman Number
        return L.replace("IIIII","V").replace("IIII","IV").replace("VV","X")\
            .replace("VIV","IX").replace("XXXXX","L").replace("XXXX","XL").replace("LL","C").replace("LXL","XC")\
            .replace("CCCCC","D").replace("CCCC","CD").replace("DD","M").replace("DCD","CM")
    def from_roman(str):
        i = str.replace( "IV", ",4" ).replace( "IX", ",9").replace( "I", ",1" ).replace("V",",5").replace("X",",10").replace( "IX", ",9" ).replace( "XL", ",40" ).replace( "L", ",50").replace( "C", ",100" ).replace( "D", ",500" ).replace( "M", ",1000" )
        arr=i.split(",")
        arrsum=0;
        for ii in arr:
            try:
                arrsum+=int(ii.replace(",",""))
                print(arrsum, ii)
            except:
                print("idk")
        print(arrsum)
        return arrsum
n = 169
print(RomanNumerals.to_roman(n))
RomanNumerals.from_roman(RomanNumerals.to_roman(n))