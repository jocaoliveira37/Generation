import { ComponentFixture, TestBed } from '@angular/core/testing';

import { JumInstituiComponent } from './jum-institui.component';

describe('JumInstituiComponent', () => {
  let component: JumInstituiComponent;
  let fixture: ComponentFixture<JumInstituiComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ JumInstituiComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(JumInstituiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
