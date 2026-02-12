import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Entidad } from '../../models/entidad.model';
import { EntidadService } from '../../services/entidad.service';

@Component({
  selector: 'app-listar-entidades',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './listar-entidades.component.html',
  styleUrl: './listar-entidades.component.css'
})
export class ListarEntidadesComponent implements OnInit {
  entidades: Entidad[] = [];

  constructor(private entidadService: EntidadService) {}

  ngOnInit(): void {
    this.entidadService.getEntidades().subscribe({
      next: (data) => this.entidades = data,
      error: (err) => console.error(err)
    });
  }
}
