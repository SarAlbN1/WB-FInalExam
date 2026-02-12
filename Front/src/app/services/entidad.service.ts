import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Entidad } from '../models/entidad.model';
import { Observable } from 'rxjs';
import { AppSettings } from '../app-settings'; 

@Injectable({
  providedIn: 'root'
})
export class EntidadService {

private apiUrl = `${AppSettings.baseUrl};

  constructor(private http: HttpClient) {}

  getEntidades(): Observable<Entidad[]> {
    return this.http.get<Entidad[]>(this.apiUrl);
  }

  getEntidad(id: number): Observable<Entidad> {
    return this.http.get<Entidad>(`${this.apiUrl}/${id}`);
  }

  createEntidad(entidad: Entidad): Observable<Entidad> {
    return this.http.post<Entidad>(this.apiUrl, entidad);
  }

  updateEntidad(id: number, entidad: Entidad): Observable<Entidad> {
    return this.http.put<Entidad>(`${this.apiUrl}/${id}`, entidad);
  }

  deleteEntidad(id: number): Observable<void> {
    return this.http.delete<void>(`${this.apiUrl}/${id}`);
  }
}
