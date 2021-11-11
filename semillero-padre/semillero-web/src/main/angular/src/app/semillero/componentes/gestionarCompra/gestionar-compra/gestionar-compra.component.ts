import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { ComicDTO } from 'src/app/semillero/dto/comic-dto';
import { GestionarCompraService } from 'src/app/semillero/servicios/gestionar-compra.service';

/**
 * @description Componente encargado de gestionar la logica para comprar
 * un comic
 * @author Daniel Rueda
 * @see SEMILLERO 2021
 */
@Component({
  selector: 'gestionar-compra',
  templateUrl: './gestionar-compra.component.html',
  styleUrls: ['./gestionar-compra.component.css']
})
export class GestionarCompraComponent implements OnInit {

  

  public comicDTO : ComicDTO;

  public nombre : String;

  public gestionarCompraForm : FormGroup;

  public cantidadaComprar : number;

  public mensajeEjecucion : string;

  public mostrarItem2 : boolean;

  public mostrarItem3: boolean;


  constructor(private fb : FormBuilder, private router : Router, private activatedRoute: ActivatedRoute, private gestionComprasService : GestionarCompraService) {
    this.gestionarCompraForm = this.fb.group({
      cantidad : [null, Validators.required, Validators.min]
    });
   }

  ngOnInit(): void {
    let comic : any = this.activatedRoute.snapshot.params;
    this.comicDTO = comic;
    this.nombre = this.comicDTO.nombre
    this.mostrarItem2=false
    this.mostrarItem3=false
  }

  public comprarComic() : void {
    if (this.gestionarCompraForm.invalid) {
      return;
    }

    this.cantidadaComprar = this.f.cantidad.value
    if(this.comicDTO.estadoEnum == "INACTIVO") {
      return;
    }

    if(this.comicDTO.cantidad > this.cantidadaComprar) {
      let nuevaCantidad : number = this.comicDTO.cantidad-this.cantidadaComprar;
      this.comicDTO.cantidad=nuevaCantidad;
      this.comicDTO.fechaCompra=Date.toString();
      this.comicDTO.estadoEnum="ACTIVO";
    }

    if(this.comicDTO.cantidad == this.cantidadaComprar) {
      this.comicDTO.cantidad=0;
      this.comicDTO.fechaCompra=Date.toString();
      this.comicDTO.estadoEnum="INACTIVO";
    }

    if(this.comicDTO.cantidad < this.cantidadaComprar) {
      return;
    }

  

    this.gestionComprasService.comprarComic(this.comicDTO, this.cantidadaComprar).subscribe(data=> {
      if (data.exitoso) {
        this.mostrarItem2=true;
        this.mensajeEjecucion =data.mensajeEjecucion;
        console.log(data.mensajeEjecucion);

        

      } else {
        this.mostrarItem3=true;
        this.mensajeEjecucion =data.mensajeEjecucion;
        
      }
      this.limpiarDatosComic();
    }, error => {
      console.log(error);
    });
    
    

  }

  public cerrarAlert() : void {
    this.mostrarItem2 = false;
    this.router.navigate(['gestionar-comic']);
  }

  public cerrarAlert2() : void {
    this.mostrarItem3 = false;
  }

  private limpiarDatosComic() : void {
    
    this.f.cantidad.setValue(null);
  }

  get f() {
    return this.gestionarCompraForm.controls;
  }

}

