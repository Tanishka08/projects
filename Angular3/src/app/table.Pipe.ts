import {Pipe, PipeTransform} from '@angular/core'
@Pipe({
    name:'links'
})
export class TablePipe implements PipeTransform
{
   transform(value:String, Gender: String): String{
       if(Gender=="Male"){
           return "Mr."+ value;
       }
       else{
           return "Mrs."+value;
       }
       }
   } 
