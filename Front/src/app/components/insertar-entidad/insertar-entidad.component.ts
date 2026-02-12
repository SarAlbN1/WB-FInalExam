import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { Entidad } from '../../models/entidad.model';
import { EntidadService } from '../../services/entidad.service';

@Component({
  selector: 'app-insertar-entidad',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './insertar-entidad.component.html',
  styleUrl: './insertar-entidad.component.css'
})
export class InsertarEntidadComponent {
  entidad: Entidad = {
    nit: '',
    nombre: '',
    contratos: []
  };

  constructor(private entidadService: EntidadService) {}

  insertarEntidad() {
    this.entidadService.createEntidad(this.entidad).subscribe({
      next: (res) => {
        alert('Entidad creada correctamente');
        this.entidad = { nit: '', nombre: '', contratos: [] };
      },
      error: (err) => {
        console.error(err);
        alert('Error al crear la entidad');
      }
    });
  }
}
