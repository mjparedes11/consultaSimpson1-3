def f1 (x:Int): Double = -math.pow(x,2)+8*x-12
def f2 (x:Int): Double = 3*math.pow(x,2)
def f3 (x:Int): Double = x+2*math.pow(x,2)-math.pow(x,3)+5*math.pow(x,4)
def f4 (x:Int): Double = (2*x+1)/(math.pow(x,2)+x)
def f5 (x:Int): Double = -math.exp(x)
def f6 (x:Int): Double = (1)/(math.sqrt(x-1))
def f7 (x:Int): Double = (1)/(1+math.pow(x,2))

def integracion (f: Int => Double, a:Int, b:Int): Double = (b-a)*((f(a)+4*f((a+b)/(2))+f(b))/6)

integracion(f1,3,5)
integracion(f2,0,2)
integracion(f3,-1,1)
integracion(f4,1,2)
integracion(f5,0,1)
integracion(f6,2,3)
integracion(x=> (1)/(1+math.pow(x,2)),0,1)

val err_aprox: (Double,Double)=> Double = (e:Double, o:Double) => math.abs(e - o)

err_aprox(integracion(f1,3,5),7.33)
err_aprox(integracion(f2,0,2),7.33)
err_aprox(integracion(f3,-1,1),7.33)
err_aprox(integracion(f4,1,2),7.33)
err_aprox(integracion(f5,0,1),7.33)
err_aprox(integracion(f6,2,3),7.33)
err_aprox(integracion(f7,0,1),7.33)