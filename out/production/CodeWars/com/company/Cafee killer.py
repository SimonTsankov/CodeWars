def coffee_limits(year, month, day):
    c_c=0;  c_d = 0;    max_c=0;     max_d=0;
    if(month<10):
        month="0"+str(month)
    if(day<10):
        day="0"+str(day)
    h= int("".join(map(str, [year,month,day])));     h_d=h
    for i in range(0,5000):
        if("dead" in str(hex(h))):
            max_c=c_c
        else:
            h=h+51966
            c_c+=1
        if("dead"in hex(h_d) and i!=0):
            max_d=c_d
        else:
            c_d+=1
            h_d=h_d+912559
    return [max_c,max_d]

y,m,d = 1880, 3, 1
print(coffee_limits(y,m,d))