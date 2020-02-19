import {NgModule} from '@angular/core'
import {RouterModule, Route, ROUTES, Routes} from '@angular/router'
import { LoginComponent } from './Components/login/login.component'
import { RegisterComponent } from './Components/register/register.component'
import { HomeComponent } from './Components/home/home.component'
import { CartComponent } from './Components/cart/cart.component'

const routes:Routes=[
    
{path:'login',component:LoginComponent},
{path:'register',component: RegisterComponent},
{path:'products', component:HomeComponent},
{path:'cart',component:CartComponent

}]
            @NgModule
            ({
                 imports:[RouterModule.forRoot(routes)],
                    exports:[RouterModule]
            }
            )
       export class AppRoutingModule
        {
    }
