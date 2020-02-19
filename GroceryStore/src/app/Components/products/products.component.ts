import { Component, OnInit } from '@angular/core';
import { DataService } from 'src/app/services/data.service';
import { THIS_EXPR } from '@angular/compiler/src/output/output_ast';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {
public subCategory:any;
public products:any;
public _image_url="http://rjtmobile.com/grocery/images/";

  constructor(private dataService:DataService) { }

  ngOnInit(): void {
    this.dataService.getSubCategory(1).subscribe(
      x=> this.subCategory=x.data

    )
this.dataService.getProducts(1).subscribe(
  x=>this.products=x.data
)
  }


addToCart(product)
{
  
  if(localStorage.cart==undefined){
  console.log(product)
  var cartItems=[];
  cartItems.push(product)

  localStorage.cart=JSON.stringify(cartItems);
  }
  else{
    var products=JSON.parse(localStorage.cart);
    products.push(product)
    localStorage.cart=JSON.stringify(products);
  }
}
}