export class ConstructorsAssignment

{
    //private firstName: String;
    //private lastName :String;
    //private age :Number;
    //private salary: Number;
    //private gender String;
    //private email String;}


constructor( public firstName: String,
    public lastName:String,
    public age:Number,
    public salary:Number,
    public gender:String,
    public email:String){

    }

getFullName()
{
console.log(this.firstName+""+this.lastName)
}
}
let emp=new ConstructorsAssignment("John","Doe",37,20000,"Male","love2code@gmail.com")
emp.getFullName();